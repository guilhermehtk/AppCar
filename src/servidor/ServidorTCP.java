package servidor;

import control.LoginController;
import java.net.*;
import java.io.*;
import servidor.json.JSONException;
import servidor.json.JSONObject;
import servidor.rest.LoginJSON;
import views.Mensagens;

public class ServidorTCP {

    private ServerSocket ss;
    private int porta;
    private Socket s = null;
    private BufferedReader br = null;
    private PrintStream ps = null;
    private String msgRecebida = "";
    public String msgResposta = "";

    public ServidorTCP(int p) {
        porta = p;//a porta pode ser um argumento 
        try {
            ss = new ServerSocket(porta);//soket do servidor
        } catch (Exception e) {
            Mensagens.erroBD(e.toString());
        }
        System.out.println("Servidor Ligado");
    }

    public void esperaConexao() {
        //laço infinito para esperar várias conexões
        while (ss!=null && ss.isBound() && !ss.isClosed()) {
            try {
                System.out.println("Esperando Conexoes");
                msgResposta = "";//declarada global, é o retorno para o cliente
                try {
                    //aguarda conexões
                    s = ss.accept();
                    //buffer de leitura, classe io, poderia estar manipulando um arquivo    
                    br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    msgRecebida = br.readLine(); // recebendo dados do cliente como string    
                    System.out.println("JSON do Cliente: \n" + msgRecebida + "\n");

                    //cria prinstream para responder ao cliente
                    ps = new PrintStream(s.getOutputStream());

                    JSONObject json = new JSONObject(msgRecebida);
                    //testa se o usuário é o teste de senha teste
                    String retorno = "-1";

                    LoginController loginController = new LoginController();
                    int flag = loginController.validaLogin(LoginJSON.getLoginJSON(json));
                    //
                    if (flag == 0) {
                        System.out.println("Senha Incorreta");
                        retorno = "Senha Incorreta";
                    } else if (flag == 1) {
                        System.out.println("Usuário Não Cadastrado");
                        retorno = "Usuário Não Cadastrado";
                    } else {
                        //*********************************************
                        // Se quiser fazer algum processamento após receber a msg o local é aqui
                        //*********************************************
                    }
                    //manda(responde) msg para o cliente
                    ps.println(retorno);
                    s.close();
                    //System.gc();
                } catch (IOException | JSONException e) {
                }//fim da exeção do socket
            } catch (Exception sd) {
            }// fim da thread
        }
    }

    public void close() throws IOException {
        System.out.println("Servidor Desligado");
        ss.close();
    }

    public void restart() throws IOException {
        System.out.println("Servidor Desligado");
        ss.close();
        ss = null;
        try {
            ss = new ServerSocket(porta);//soket do servidor
        } catch (Exception e) {
            Mensagens.erroBD(e.toString());
        }
        System.out.println("Servidor Ligado");

    }
}
