package control;

import java.util.ArrayList;
import model.Cliente;
import model.dao.ClienteDao;

public class ClienteController implements InterfaceControllerCrud {

    ClienteDao cliDao = new ClienteDao();

    @Override
    public int add(Object cliente) {
        return cliDao.add((Cliente) cliente);
    }

    @Override
    public void remove(int id) {
       cliDao.remove(id);
    }

    @Override
    public void altera(Object cliente) {
       Cliente mec = (Cliente) cliente;
       cliDao.altera(mec);
    }

    public Cliente get(int id) {
         return cliDao.get(id);
    }

    @Override
    public ArrayList getAll() {
        return cliDao.getAll();

    }

    @Override
    public ArrayList<String> valida(Object cliente) {
        Cliente mec = (Cliente) cliente;
        ArrayList<String> erros = new ArrayList();
        if (mec.getNome().isEmpty()) {
            erros.add("Nome");
        }
        if (mec.getCpf().isEmpty()) {
            erros.add("CPF");
        }
        if (mec.getRg().isEmpty()) {
            erros.add("RG");
        }
        if (mec.getTelefoneM().isEmpty()) {
            erros.add("Telefone");
        }
        if (mec.getSexo().isEmpty()) {
            erros.add("Sexo");
        }
        return erros;
    }

}
