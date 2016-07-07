package control;

import java.util.ArrayList;
import model.Mecanico;
import model.dao.MecanicoDao;

public class MecanicoController implements InterfaceControllerCrud {

    MecanicoDao mecDao = new MecanicoDao();

    @Override
    public int add(Object mecanico) {
        return mecDao.add((Mecanico) mecanico);
    }

    @Override
    public void remove(int id) {
       mecDao.remove(id);
    }

    @Override
    public void altera(Object mecanico) {
       Mecanico mec = (Mecanico) mecanico;
       mecDao.altera(mec);
    }

    @Override
    public Object get(int id) {
         return mecDao.get(id);
    }

    @Override
    public ArrayList getAll() {
        return mecDao.getAll();

    }

    @Override
    public ArrayList<String> valida(Object mecanico) {
        Mecanico mec = (Mecanico) mecanico;
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
