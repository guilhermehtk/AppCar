package model.dao;

import static model.dao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import model.OrdemServico;

public class OrdemServicoDao implements InterfaceDao {

    private Connection con;

    public OrdemServicoDao() {
        this.con = getConnection();
    }

    public int add(Object ordemser) {
        // cria a query
        String sql = "insert into OrdemServicos (osTipo,osData,osSituacao,osDescricao,os_cliCod,os_carCod) values (?,?,?,?,?,?)";
        // cast
        OrdemServico os = (OrdemServico) ordemser;
        // id
        int id = 0;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // seta os valores
            stmt.setString(1, os.getTipo());
            stmt.setString(2, os.getData().toString());
            stmt.setInt(3, os.getSituacao());
            stmt.setString(4, os.getDescricao());
            stmt.setInt(5, os.getCliCod());
            stmt.setInt(6, os.getCarCod());

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
        String sql = "delete from OrdemServicos where osCod=?;";
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

    public void altera(Object ordemser) {
        // cria a query
        String sql = "update OrdemServicos set osTipo=?,osData=?,osSituacao=?,osDescricao=?,os_cliCod=?,os_carCod=? where osCod=?";
        // cast
        OrdemServico os = (OrdemServico) ordemser;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, os.getTipo());
            stmt.setString(2, os.getData().toString());
            stmt.setInt(3, os.getSituacao());
            stmt.setString(4, os.getDescricao());
            stmt.setInt(5, os.getCliCod());
            stmt.setInt(6, os.getCarCod());
            stmt.setInt(7, os.getCod());

            // executa
            stmt.execute();
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public OrdemServico get(int id) {
        // cria a query
        String sql = "select * from OrdemServicos where osCod=?;";
        OrdemServico os = null;
        try {
            // prepared statement para seleção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, id);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria o os
            while (rs.next()) {
                os = new OrdemServico(rs.getString(2), rs.getInt(4), rs.getInt(6), rs.getInt(7),rs.getString(5));
                os.setCod(rs.getInt(1));
                os.setData(Timestamp.valueOf(rs.getString(3)));
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return os;
    }

    public ArrayList<OrdemServico> getAll() {
        // cria a query
        String sql = "select * from OrdemServicos;";
        // cria o ArrayList
        ArrayList<OrdemServico> lista = new ArrayList<>();
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria a lista
            while (rs.next()) {
                OrdemServico os = new OrdemServico(rs.getString(2), rs.getInt(4), rs.getInt(6), rs.getInt(7),rs.getString(5));
                os.setCod(rs.getInt(1));
                os.setData(Timestamp.valueOf(rs.getString(3)));
                lista.add(os);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

}
