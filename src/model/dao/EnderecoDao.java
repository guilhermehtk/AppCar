package model.dao;

import static model.dao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Endereco;

public class EnderecoDao implements InterfaceDao {

    private Connection con;

    public EnderecoDao() {
        this.con = getConnection();
    }

    public int add(Object end) {
        // cria a query
        String sql = "insert into enderecos (endNumero,endRua,endBairro,endCidade,endCep,endComplemento) values (?,?,?,?,?,?)";
        // cast
        Endereco endereco = (Endereco) end;
        // id
        int id = 0;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // seta os valores
            stmt.setString(1, endereco.getNumero());
            stmt.setString(2, endereco.getRua());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getCidade());
            stmt.setString(5, endereco.getCep());
            stmt.setString(6, endereco.getComplemento());

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
        String sql = "delete from enderecos where endCod=?;";
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

    public void altera(Object end) {
        // cria a query
        String sql = "update enderecos set endNumero=?,endRua=?,endBairro=?,endCidade=?,endCep=?,endComplemento=? where endCod=?";
        // cast
        Endereco endereco = (Endereco) end;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, endereco.getNumero());
            stmt.setString(2, endereco.getRua());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getCidade());
            stmt.setString(5, endereco.getCep());
            stmt.setString(6, endereco.getComplemento());
            stmt.setInt(7, endereco.getCod());

            // executa
            stmt.execute();
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Endereco get(int id) {
        // cria a query
        String sql = "select * from enderecos where endCod=?;";
        Endereco endereco = null;
        try {
            // prepared statement para seleção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, id);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria o endereco
            while (rs.next()) {
                endereco = new Endereco(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                endereco.setCod(rs.getInt(1));
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return endereco;
    }

    public ArrayList<Endereco> getAll() {
        // cria a query
        String sql = "select * from enderecos;";
        // cria o ArrayList
        ArrayList<Endereco> lista = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria a lista
            while (rs.next()) {
                Endereco endereco = new Endereco(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                endereco.setCod(rs.getInt(1));
                lista.add(endereco);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

}
