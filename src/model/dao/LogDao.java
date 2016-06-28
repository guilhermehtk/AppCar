package model.dao;

import static model.dao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import model.Log;

public class LogDao implements InterfaceDao {

    private Connection con;

    public LogDao() {
        this.con = getConnection();
    }

    public int add(Object logs) {
        // cria a query
        String sql = "insert into logs (logDescricao,logData,log_mecCod) values (?,?,?)";
        // cast
        Log log = (Log) logs;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, log.getDescricao());
            stmt.setString(2, log.getData().toString());
            stmt.setInt(3, log.getMecCod());

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
        String sql = "delete from logs where logCod=?;";
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

    public void altera(int id, Object logs) {
        // cria a query
        String sql = "update logs set logDescricao=?,logData=?,log_mecCod=? where logCod=?";
        // cast
        Log log = (Log) logs;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
         stmt.setString(1, log.getDescricao());
            stmt.setString(2, log.getData().toString());
            stmt.setInt(3, log.getMecCod());
            stmt.setInt(4, id);

            // executa
            stmt.execute();
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Log get(int id) {
        // cria a query
        String sql = "select * from logs where logCod=?;";
        Log log = null;
        try {
            // prepared statement para seleção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, id);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria o log
            while (rs.next()) {
                log = new Log(rs.getString(2),rs.getInt(4));
                log.setData(Timestamp.valueOf(rs.getString(3)));
                log.setCod(rs.getInt(1));
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return log;
    }

    public ArrayList<Log> getAll() {
        // cria a query
        String sql = "select * from logs;";
        // cria o ArrayList
        ArrayList<Log> lista = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria a lista
            while (rs.next()) {
                Log log = new Log(rs.getString(2),rs.getInt(4));
                log.setData(Timestamp.valueOf(rs.getString(3)));
                log.setCod(rs.getInt(1));
                lista.add(log);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

}
