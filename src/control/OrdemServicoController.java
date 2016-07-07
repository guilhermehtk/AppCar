package control;

import java.sql.Timestamp;
import java.util.ArrayList;
import model.OrdemServico;
import model.dao.OrdemServicoDao;

public class OrdemServicoController implements InterfaceControllerCrud {

    OrdemServicoDao osDao = new OrdemServicoDao();

    @Override
    public int add(Object ordemServico) {
        OrdemServico os = (OrdemServico) ordemServico;
        os.setSituacao(1); // Orçamento
        os.setData(new Timestamp(System.currentTimeMillis()));
        return osDao.add(os);
    }

    @Override
    public void remove(int id) {
       osDao.remove(id);
    }

    @Override
    public void altera(Object ordemServico) {
       OrdemServico os = (OrdemServico) ordemServico;
       osDao.altera(os);
    }

    @Override
    public Object get(int id) {
         return osDao.get(id);
    }

    @Override
    public ArrayList getAll() {
        return osDao.getAll();

    }

    @Override
    public ArrayList<String> valida(Object ordemServico) {
        OrdemServico os = (OrdemServico) ordemServico;
        ArrayList<String> erros = new ArrayList();
        if (os.getCliCod()==0) {
            erros.add("Cliente");
        }
        if (os.getCarCod()==0) {
            erros.add("Carro");
        }
        if (os.getTipo().isEmpty()) {
            erros.add("Tipo");
        }
        return erros;
    }

}
