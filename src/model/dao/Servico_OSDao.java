package model.dao;

import static model.dao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Servico_OS;

public class Servico_OSDao implements InterfaceDao {

    private Connection con;

    public Servico_OSDao() {
        this.con = getConnection();
    }

    public int add(Object ser) {
        // cria a query
        String sql = "insert into Servicos_OS (ser_osCod,ser_mecCod,ser_svcCod) values (?,?,?)";
        // cast
        Servico_OS servico_OS = (Servico_OS) ser;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, servico_OS.getOsCod());
            stmt.setInt(2, servico_OS.getMecCod());
            stmt.setInt(2, servico_OS.getSvcCod());
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
        String sql = "delete from Servicos_OS where serCod=?;";
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

    public void altera(Object ser) {
        // cria a query
        String sql = "update Servicos_OS set ser_osCod=?,ser_mecCod=?,ser_svcCod=? where serCod=?";
        // cast
        Servico_OS servico_OS = (Servico_OS) ser;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, servico_OS.getOsCod());
            stmt.setInt(2, servico_OS.getMecCod());
            stmt.setInt(3, servico_OS.getSvcCod());
            stmt.setInt(4, servico_OS.getCod());

            // executa
            stmt.execute();
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Servico_OS get(int id) {
        // cria a query
        String sql = "select * from Servicos_OS where serCod=?;";
        Servico_OS servico_OS = null;
        try {
            // prepared statement para seleção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, id);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria o servico_OS
            while (rs.next()) {
                servico_OS = new Servico_OS(rs.getInt(3), rs.getInt(2), rs.getInt(4));
                servico_OS.setCod(rs.getInt(1));
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return servico_OS;
    }

    public ArrayList<Servico_OS> getAll() {
        // cria a query
        String sql = "select * from Servicos_OS;";
        // cria o ArrayList
        ArrayList<Servico_OS> lista = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria a lista
            while (rs.next()) {
                Servico_OS servico_OS = new Servico_OS(rs.getInt(3), rs.getInt(2), rs.getInt(4));
                servico_OS.setCod(rs.getInt(1));
                lista.add(servico_OS);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    public ArrayList<Servico_OS> getOS(int os) {
        // cria a query
        String sql = "select * from Servicos_OS where ser_osCod=?;";
        // cria o ArrayList
        ArrayList<Servico_OS> lista = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, os);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria a lista
            while (rs.next()) {
                Servico_OS servico_OS = new Servico_OS(rs.getInt(3), rs.getInt(2), rs.getInt(4));
                servico_OS.setCod(rs.getInt(1));
                lista.add(servico_OS);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

}
