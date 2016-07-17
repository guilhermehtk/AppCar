package views;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Erros {
    public static void erroBD(String erro){
        JOptionPane.showMessageDialog(null, "Erro na Conexão com o Banco de Dados "+erro, "Erro",JOptionPane.ERROR_MESSAGE);
    }
    
    public static boolean errosValidacao(ArrayList<String> erros){
        if(erros.isEmpty()){
           return true; 
        } else {
            if (erros.size()==1){
            JOptionPane.showMessageDialog(null, "O campo "+erros.get(0)+" não foi preenchido","Erro",JOptionPane.ERROR_MESSAGE);
            } else {
                  String mensagem = null;
               for (String erro : erros) {
                if (erros.get(0).equals(erro)){
                    mensagem = erro;
                } else if(erros.size()-1==erros.indexOf(erro)){
                   mensagem = mensagem + " e "+erro;   
                }  else {
                     mensagem = mensagem + ", "+erro;   
                }
            }
               JOptionPane.showMessageDialog(null, "Os campos "+mensagem+" não foram preenchidos","Erro",JOptionPane.ERROR_MESSAGE);
            }
                return false;
        }
        
    }
}
