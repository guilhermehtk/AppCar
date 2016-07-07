package model.dao;

import static model.dao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Mecanico;

public class MecanicoDao implements InterfaceDao {

    private final Connection con;

    public MecanicoDao() {
        this.con = getConnection();
    }

    @Override
    public int add(Object mec) {
        // dao para inserir o endereco
        EnderecoDao endDao = new EnderecoDao();
        // dao para inserir o login
        LoginDao loginDao = new LoginDao();
        // cria a query
        String sql = "insert into pessoas (pesNome,pesSexo,pesEmail,pesTelefoneM,pesTelefoneF,pesCpf,pesRg,pesTipo,pes_endCodigo) values (?,?,?,?,?,?,?,?,?)";
        // cast
        Mecanico mecanico = (Mecanico) mec;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

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
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // retorna o id
        LastInsertDao id = new LastInsertDao();
        return id.getLastInsert();
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
        Mecanico mecanico = (Mecanico) mec;
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
            stmt.setInt(8,mecanico.getCodigo());

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

    public Mecanico get(int id) {
        // dao para selecionar o endereco
        EnderecoDao endDao = new EnderecoDao();
        // dao para sleecionar o login
        LoginDao loginDao = new LoginDao();
        // cria a query
        String sql = "select * from pessoas where pesCod=?;";
        // cria o objeto
        Mecanico mecanico = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta o codigo
            stmt.setInt(1, id);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria o mecanico
            while (rs.next()) {
                mecanico = new Mecanico(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), endDao.get(rs.getInt(9)), loginDao.get(rs.getInt(10)));
                mecanico.setCodigo(rs.getInt(1));
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return mecanico;
    }

    public ArrayList<Mecanico> getAll() {
        // dao para inserir o endereco
        EnderecoDao endDao = new EnderecoDao();
        // dao para sleecionar o login
        LoginDao loginDao = new LoginDao();
        // cria a query
        String sql = "select * from pessoas where pesTipo=3;";
        // cria o ArrayList
        ArrayList<Mecanico> lista = new ArrayList();
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // executa
            ResultSet rs = stmt.executeQuery();

            //joga resultado da consulta no ArrayList
            while (rs.next()) {
                Mecanico mecanico = new Mecanico(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), endDao.get(rs.getInt(9)), loginDao.get(rs.getInt(10)));
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

    public Mecanico getLogin(int idLogin){
        // dao para inserir o endereco
        EnderecoDao endDao = new EnderecoDao();
        // dao para sleecionar o login
        LoginDao loginDao = new LoginDao();
        // cria a query
        String sql = "select * from pessoas where pes_loginCod=?;";
         // cria o objeto
        Mecanico mecanico = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

               // seta o codigo
            stmt.setInt(1, idLogin);
            
            // executa
            ResultSet rs = stmt.executeQuery();

            //joga resultado da consulta no ArrayList
            while (rs.next()) {
                mecanico = new Mecanico(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), endDao.get(rs.getInt(9)), loginDao.get(rs.getInt(10)));
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
