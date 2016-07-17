package model.dao;

import static model.dao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Servico;

public class ServicoDao implements InterfaceDao {

    private Connection con;

    public ServicoDao() {
        this.con = getConnection();
    }

    public int add(Object ser) {
        // cria a query
        String sql = "insert into Servicos (svcDescricao,svcValor) values (?,?)";
        // cast
        Servico servico = (Servico) ser;
        // id
        int id = 0;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // seta os valores
            stmt.setString(1, servico.getDescricao());
            stmt.setDouble(2, servico.getValor());
            // executa
            stmt.execute();

            // pega o id gerado
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }

            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // retorna o id
        return id;
    }

    public void remove(int id) {
        // cria a query
        String sql = "delete from Servicos where svcCod=?;";
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
        String sql = "update Servico set svcDescricao=?,svcValor=? where svcCod=?";
        // cast
        Servico servico = (Servico) ser;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, servico.getDescricao());
            stmt.setDouble(2, servico.getValor());
            stmt.setInt(3, servico.getCod());

            // executa
            stmt.execute();
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Servico get(int id) {
        // cria a query
        String sql = "select * from Servicos where svcCod=?;";
        Servico servico = null;
        try {
            // prepared statement para seleção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, id);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria o servico
            while (rs.next()) {
                servico = new Servico(rs.getString(2), rs.getDouble(3));
                servico.setCod(rs.getInt(1));
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return servico;
    }

    public ArrayList<Servico> getAll() {
        // cria a query
        String sql = "select * from Servicos;";
        // cria o ArrayList
        ArrayList<Servico> lista = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria a lista
            while (rs.next()) {
                Servico servico = new Servico(rs.getString(2), rs.getDouble(3));
                servico.setCod(rs.getInt(1));
                lista.add(servico);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
}
