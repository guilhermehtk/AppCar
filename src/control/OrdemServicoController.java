package control;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.OrdemServico;
import model.dao.CarroDao;
import model.dao.ClienteDao;
import model.dao.OrdemServicoDao;

public class OrdemServicoController implements InterfaceControllerCrud {

    OrdemServicoDao osDao = new OrdemServicoDao();
    CarroDao carDao = new CarroDao();
    ClienteDao cliDao = new ClienteDao();

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
    public OrdemServico get(int id) {
        return osDao.get(id);
    }

    @Override
    public ArrayList<OrdemServico> getAll() {
        return osDao.getAll();

    }

    @Override
    public ArrayList<String> valida(Object ordemServico) {
        OrdemServico os = (OrdemServico) ordemServico;
        ArrayList<String> erros = new ArrayList();
        if (os.getCliCod() == 0) {
            erros.add("Cliente");
        }
        if (os.getCarCod() == 0) {
            erros.add("Carro");
        }
        if (os.getTipo().isEmpty()) {
            erros.add("Tipo");
        }
        return erros;
    }
    
      public DefaultComboBoxModel procurar(int tipo) {
        DefaultComboBoxModel cbArray = new DefaultComboBoxModel();
        cbArray.insertElementAt("Selecione...", 0);
        switch (tipo) {
            case 0:
                // Código
                for (OrdemServico os : getAll()) {
                    cbArray.addElement(os.getCod() + " | " + carDao.get(os.getCarCod()).getPlaca());
                }
                break;
            case 1:
                // Cliente
                for (OrdemServico os : getAll()) {
                    cbArray.addElement(cliDao.get(os.getCliCod()).getNome() + " | " + carDao.get(os.getCarCod()).getPlaca());
                }
                break;
            case 2:
                // Carro
                for (OrdemServico os : getAll()) {
                    cbArray.addElement(carDao.get(os.getCarCod()).getPlaca() + " | " + os.getData());
                }
                break;
            case 3:
                // Data
                for (OrdemServico os : getAll()) {
                    cbArray.addElement(new SimpleDateFormat("dd/MM/yyyy").format(os.getData()) + " | " + carDao.get(os.getCarCod()).getPlaca());
                }
                break;
        }

        return cbArray;
    }

   

}
