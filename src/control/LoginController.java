package control;

import model.Login;
import model.dao.LoginDao;
import model.dao.MecanicoDao;

public class LoginController {

    LoginDao loginDao = new LoginDao();
    MecanicoDao mecanicoDao = new MecanicoDao();
    Login log;

    public int validaLogin(Login login) {
        log = loginDao.getUsuario(login);
        if (log != null) {
            if (login.getSenha().equals(log.getSenha())) {
                // Validou -> Retorna ID do usuário
                return mecanicoDao.getLogin(log.getCod()).getCodigo();
            } else {
                // Senha Incorreta
                return 0;
            }
        } else {
            // Usuario Incorreto
            return 1;
        }

    }

}
