package model.dao;

import static model.dao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Funcionario;

public class FuncionarioDao implements InterfaceDao {

    private final Connection con;

    public FuncionarioDao() {
        this.con = getConnection();
    }

    @Override
    public int add(Object mec) {
        // dao para inserir o endereco
        EnderecoDao endDao = new EnderecoDao();
        // dao para inserir o login
        LoginDao loginDao = new LoginDao();
        // cria a query
        String sql = "insert into pessoas (pesNome,pesSexo,pesEmail,pesTelefoneM,pesTelefoneF,pesCpf,pesRg,pesTipo,pes_endCod,pes_loginCod) values (?,?,?,?,?,?,?,?,?,?)";
        // cast
        Funcionario mecanico = (Funcionario) mec;
        // id
        int id = 0;
        try {
            PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // seta os valores
            stmt.setString(1, mecanico.getNome());
            stmt.setString(2, mecanico.getSexo());
            stmt.setString(3, mecanico.getEmail());
            stmt.setString(4, mecanico.getTelefoneM());
            stmt.setString(5, mecanico.getTelefoneF());
            stmt.setString(6, mecanico.getCpf());
            stmt.setString(7, mecanico.getRg());
            stmt.setInt(8, mecanico.getTipo());
            stmt.setInt(9, endDao.add(mecanico.getEndereco()));
            stmt.setInt(10, loginDao.add(mecanico.getLogin()));

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
    public void altera(Object mec) {
        // dao para alterar o endereco
        EnderecoDao endDao = new EnderecoDao();
        // dao para alterar o login
        LoginDao loginDao = new LoginDao();
        // cria a query
        String sql = "update pessoas set pesNome=?,pesSexo=?,pesEmail=?,pesTelefoneM=?,pesTelefoneF=?,pesCpf=?,pesRg=? where pesCod=?";
        // cast
        Funcionario mecanico = (Funcionario) mec;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, mecanico.getNome());
            stmt.setString(2, mecanico.getSexo());
            stmt.setString(3, mecanico.getEmail());
            stmt.setString(4, mecanico.getTelefoneM());
            stmt.setString(5, mecanico.getTelefoneF());
            stmt.setString(6, mecanico.getCpf());
            stmt.setString(7, mecanico.getRg());
            stmt.setInt(8, mecanico.getCodigo());

            // executa
            stmt.execute();
            // fecha a conexão
            stmt.close();

            // altera o endereço
            endDao.altera(mecanico.getEndereco());

            // altera o login
            loginDao.altera(mecanico.getLogin());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Funcionario get(int id) {
        // dao para selecionar o endereco
        EnderecoDao endDao = new EnderecoDao();
        // dao para sleecionar o login
        LoginDao loginDao = new LoginDao();
        // cria a query
        String sql = "select * from pessoas where pesCod=? and pesTipo=3;";
        // cria o objeto
        Funcionario mecanico = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta o codigo
            stmt.setInt(1, id);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria o mecanico
            while (rs.next()) {
                mecanico = new Funcionario(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), endDao.get(rs.getInt(10)), loginDao.get(rs.getInt(11)));
                mecanico.setCodigo(rs.getInt(1));
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return mecanico;
    }

    public ArrayList<Funcionario> getAll() {
        // dao para inserir o endereco
        EnderecoDao endDao = new EnderecoDao();
        // dao para sleecionar o login
        LoginDao loginDao = new LoginDao();
        // cria a query
        String sql = "select * from pessoas where pesTipo=3;";
        // cria o ArrayList
        ArrayList<Funcionario> lista = new ArrayList();
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // executa
            ResultSet rs = stmt.executeQuery();

            //joga resultado da consulta no ArrayList
            while (rs.next()) {
                Funcionario mecanico = new Funcionario(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), endDao.get(rs.getInt(10)), loginDao.get(rs.getInt(11)));
                mecanico.setCodigo(rs.getInt(1));
                lista.add(mecanico);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    public Funcionario getLogin(int idLogin) {
        // dao para inserir o endereco
        EnderecoDao endDao = new EnderecoDao();
        // dao para sleecionar o login
        LoginDao loginDao = new LoginDao();
        // cria a query
        String sql = "select * from pessoas where pes_loginCod=?;";
        // cria o objeto
        Funcionario mecanico = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta o codigo
            stmt.setInt(1, idLogin);

            // executa
            ResultSet rs = stmt.executeQuery();

            //joga resultado da consulta no ArrayList
            while (rs.next()) {
                mecanico = new Funcionario(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), endDao.get(rs.getInt(10)), loginDao.get(rs.getInt(11)));
                mecanico.setCodigo(rs.getInt(1));
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return mecanico;
    }
}
