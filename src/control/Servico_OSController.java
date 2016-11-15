package control;

import control.*;
import java.util.ArrayList;
import model.Servico_OS;
import model.dao.Servico_OSDao;

public class Servico_OSController implements InterfaceControllerCrud {

    Servico_OSDao serDao = new Servico_OSDao();

    @Override
    public int add(Object ser) {
        return serDao.add((Servico_OS) ser);
    }

    @Override
    public void remove(int id) {
        serDao.remove(id);
    }

    @Override
    public void altera(Object ser) {
        Servico_OS servOS = (Servico_OS) ser;
        serDao.altera(servOS);
    }

    @Override
    public Object get(int id) {
        return serDao.get(id);
    }

    @Override
    public ArrayList<Servico_OS> getAll() {
        return serDao.getAll();
    }

    public ArrayList<Servico_OS> getAllOS(int os) {
        return serDao.getOS(os);
    }

    @Override
    public ArrayList<String> valida(Object ser) {
        Servico_OS serv = (Servico_OS) ser;
        ArrayList<String> erros = new ArrayList();
        if (serv.getOsCod() == 0) {
            erros.add("Código da OS");
        }
        if (serv.getMecCod() == 0) {
            erros.add("Código do Funcionário");
        }
        if (serv.getSvcCod() == 0) {
            erros.add("Código do Serviço");
        }
        return erros;
    }

}
