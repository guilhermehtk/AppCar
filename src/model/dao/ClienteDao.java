package model.dao;

import static model.dao.ConnectionFactory.getConnection;
import model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDao implements InterfaceDao {

    private final Connection con;

    public ClienteDao() {
        this.con = getConnection();
    }

    @Override
    public int add(Object cli) {
        // dao para inserir o endereco
        EnderecoDao endDao = new EnderecoDao();
        // cria a query
        String sql = "insert into pessoas (pesNome,pesSexo,pesEmail,pesTelefoneM,pesTelefoneF,pesCpf,pesRg,pesTipo,pes_endCod) values (?,?,?,?,?,?,?,?,?)";
        // cast
        Cliente cliente = (Cliente) cli;
        // id
        int id = 0;
        try {
            PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // seta os valores
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getSexo());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefoneM());
            stmt.setString(5, cliente.getTelefoneF());
            stmt.setString(6, cliente.getCpf());
            stmt.setString(7, cliente.getRg());
            stmt.setInt(8, cliente.getTipo());
            stmt.setInt(9, endDao.add(cliente.getEndereco()));

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

    @Override
    public void remove(int id) {
        // cria a query
        String sql = "delete from pessoas where pesCod=?;";
        try {
            // prepared statement para inserção
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

    @Override
    public void altera(Object cli) {
        // dao para alterar o endereco
        EnderecoDao endDao = new EnderecoDao();
        // cria a query
        String sql = "update pessoas set pesNome=?,pesSexo=?,pesEmail=?,pesTelefoneM=?,pesTelefoneF=?,pesCpf=?,pesRg=? where pesCod=?";
        // cast
        Cliente cliente = (Cliente) cli;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getSexo());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefoneM());
            stmt.setString(5, cliente.getTelefoneF());
            stmt.setString(6, cliente.getCpf());
            stmt.setString(7, cliente.getRg());
            stmt.setInt(8, cliente.getCodigo());

            // executa
            stmt.execute();
            // fecha a conexão
            stmt.close();

            // altera o endereço
            endDao.altera(cliente.getEndereco());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Cliente get(int id) {
        // dao para selecionar o endereco
        EnderecoDao endDao = new EnderecoDao();
        // cria a query
        String sql = "select * from pessoas where pesCod=? and pesTipo=2;";
        // cria o objeto
        Cliente cliente = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta o codigo
            stmt.setInt(1, id);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria o cliente
            while (rs.next()) {
                cliente = new Cliente(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), endDao.get(rs.getInt(10)));
                cliente.setCodigo(rs.getInt(1));
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cliente;
    }

    public ArrayList<Cliente> getAll() {
        // dao para inserir o endereco
        EnderecoDao endDao = new EnderecoDao();
        // cria a query
        String sql = "select * from pessoas where pesTipo=2;";
        // cria o ArrayList
        ArrayList<Cliente> lista = new ArrayList();
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // executa
            ResultSet rs = stmt.executeQuery();

            //joga resultado da consulta no ArrayList
            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), endDao.get(rs.getInt(10)));
                cliente.setCodigo(rs.getInt(1));
                lista.add(cliente);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    public ArrayList<Cliente> getNome(String nome) {
        // dao para inserir o endereco
        EnderecoDao endDao = new EnderecoDao();
        // cria a query
        String sql = "select * from pessoas where pesTipo=2 and pesNome like '%?%';";
        // cria o ArrayList
        ArrayList<Cliente> lista = new ArrayList();
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, nome);

            // executa
            ResultSet rs = stmt.executeQuery();

            //joga resultado da consulta no ArrayList
            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), endDao.get(rs.getInt(10)));
                cliente.setCodigo(rs.getInt(1));
                lista.add(cliente);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

}
