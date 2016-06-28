package model.dao;

import static model.dao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Login;

public class LoginDao implements InterfaceDao {

    private Connection con;

    public LoginDao() {
        this.con = getConnection();
    }

    public int add(Object end) {
        // cria a query
        String sql = "insert into logins (loginUsuario,loginSenha) values (?,?)";
        // cast
        Login login = (Login) end;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, login.getUsuario());
            stmt.setString(2, login.getSenha());

            // executa
            stmt.execute();
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // retorna o id
        LastInsertDao id = new LastInsertDao();
        return id.getLastInsert();
    }

    public void remove(int id) {
        // cria a query
        String sql = "delete from logins where loginCod=?;";
        try {
            // prepared statement para deleção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, id);

            // executa
            stmt.execute();
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void altera(int id, Object log) {
        // cria a query
        String sql = "update logins set loginUsuario=?,loginSenha=? where loginCod=?";
        // cast
        Login login = (Login) log;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
               stmt.setString(1, login.getUsuario());
            stmt.setString(2, login.getSenha());
            stmt.setInt(3, id);

            // executa
            stmt.execute();
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Login get(int id) {
        // cria a query
        String sql = "select * from logins where loginCod=?;";
        Login login = null;
        try {
            // prepared statement para seleção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, id);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria o login
            while (rs.next()) {
                login = new Login(rs.getString(1),rs.getString(2));
                login.setCod(rs.getInt(1));
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return login;
    }

    public ArrayList<Login> getAll() {
        // cria a query
        String sql = "select * from logins;";
        // cria o ArrayList
        ArrayList<Login> lista = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria a lista
            while (rs.next()) {
                Login login = new Login(rs.getString(1),rs.getString(2));
                login.setCod(rs.getInt(1));
                lista.add(login);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

}
