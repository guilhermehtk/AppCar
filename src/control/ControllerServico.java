package control;

import java.util.ArrayList;
import model.Servico;
import model.dao.ServicoDao;

public class ControllerServico implements InterfaceControllerCrud {

    ServicoDao serDao = new ServicoDao();

    @Override
    public int add(Object servico) {
        return serDao.add((Servico) servico);
    }

    @Override
    public void remove(int id) {
        serDao.remove(id);
    }

    @Override
    public void altera(Object servico) {
        Servico ser = (Servico) servico;
        serDao.altera(ser);
    }

    @Override
    public Object get(int id) {
        return serDao.get(id);
    }

    @Override
    public ArrayList getAll() {
        return serDao.getAll();

    }

    @Override
    public ArrayList<String> valida(Object servico) {
        Servico ser = (Servico) servico;
        ArrayList<String> erros = new ArrayList();
        if (ser.getDescricao().isEmpty()) {
            erros.add("Nome");
        }
        if (ser.getValor() != 0) {
            erros.add("Valor");
        }
        return erros;
    }

}
