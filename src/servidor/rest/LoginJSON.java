package servidor.rest;

import java.util.ArrayList;
import model.Login;
import servidor.json.JSONArray;
import servidor.json.JSONException;
import servidor.json.JSONObject;

public class LoginJSON {

    public static Login getLoginJSON(JSONObject json) {
        //instancia vetor de logins
        Login login = new Login();
        try {
            //pega do json os registros da tag login
            JSONArray vetor = (JSONArray) json.get("login");
            JSONObject object = (JSONObject) vetor.get(0);
            login.setCod(object.getInt("loginCod"));
            login.setUsuario(object.getString("loginUsuario"));
            login.setSenha(object.getString("loginSenha"));
        } catch (Exception x) {
        }
        return login;
    }

}
