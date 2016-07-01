package control;

import model.Login;
import model.Mecanico;
import model.dao.LoginDao;
import model.dao.MecanicoDao;

public class LoginController {

    LoginDao loginDao = new LoginDao();
    MecanicoDao mecanicoDao = new MecanicoDao();
    Login log;

    public Mecanico validaLogin(Login login) {
        log = loginDao.get(login);
        if (log.getCod() != 0) {
            if (login.getSenha().equals(log.getSenha())) {
                return mecanicoDao.getLogin(log.getCod());
            }
        }
        return null;
    }

}
