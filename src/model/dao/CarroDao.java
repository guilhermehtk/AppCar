package model.dao;

import static model.dao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Carro;
import model.Cliente;

public class CarroDao implements InterfaceDao {

    private Connection con;

    public CarroDao() {
        this.con = getConnection();
    }

    public int add(Object car) {
        // cria a query
        String sql = "insert into carros (carMarca,carModelo,carCor,carAno,carNumeroChassi,carQuilometragem,carPlaca,carObs) values (?,?,?,?,?,?,?,?)";
        // cast
        Carro carro = (Carro) car;
        // cria id
        int id = 0;
        
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // seta os valores
            stmt.setString(1, carro.getMarca());
            stmt.setString(2, carro.getModelo());
            stmt.setString(3, carro.getCor());
            stmt.setString(4, carro.getAno());
            stmt.setString(5, carro.getChassi());
            stmt.setString(6, carro.getKm());
            stmt.setString(5, carro.getPlaca());
            stmt.setString(6, carro.getObs());

            // executa
            stmt.execute();

            // pega o id gerado
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }

            // adiciona um dono na tabela n para n
            this.addDono(id, carro.getDono());

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
        String sql = "delete from carros where carCod=?;";
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

    public void altera(Object car) {
        // cria a query
        String sql = "update carros set carMarca=?,carModelo=?,carCor=?,carAno=?,carNumeroChassi=?,carQuilometragem=?,carPlaca=?,carObs=? where carCod=?";
        // cast
        Carro carro = (Carro) car;
        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, carro.getMarca());
            stmt.setString(2, carro.getModelo());
            stmt.setString(3, carro.getCor());
            stmt.setString(4, carro.getAno());
            stmt.setString(5, carro.getChassi());
            stmt.setString(6, carro.getKm());
            stmt.setString(5, carro.getPlaca());
            stmt.setString(6, carro.getObs());
            stmt.setInt(7, carro.getCod());

            // executa
            stmt.execute();
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Carro get(int id) {
        // cria a query
        String sql = "select * from carros where carCod=?;";
        Carro carro = null;
        try {
            // prepared statement para seleção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, id);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria o carro
            while (rs.next()) {
                carro = new Carro(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                carro.setCod(rs.getInt(1));
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return carro;
    }

    public ArrayList<Carro> getAll() {
        // cria a query
        String sql = "select * from carros;";
        // cria o ArrayList
        ArrayList<Carro> lista = new ArrayList();
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria a lista
            while (rs.next()) {
                Carro carro = new Carro(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                carro.setCod(rs.getInt(1));
                lista.add(carro);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    public ArrayList<Carro> getPlaca(String placa) {
        // cria a query
        String sql = "select * from carros where carPlaca like '%?%' order by carCod;";
        // cria o ArrayList
        ArrayList<Carro> lista = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, placa);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria a lista
            while (rs.next()) {
                Carro carro = new Carro(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                carro.setCod(rs.getInt(1));
                lista.add(carro);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    public ArrayList<Carro> getChassi(String chassi) {
        // cria a query
        String sql = "select * from carros where carChassi like '%?%' order by carCod;";
        // cria o ArrayList
        ArrayList<Carro> lista = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, chassi);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria a lista
            while (rs.next()) {
                Carro carro = new Carro(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                carro.setCod(rs.getInt(1));
                lista.add(carro);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
    
    public ArrayList<Carro> getDono(String nomeDono) {
        // cria a query
        String sql = "select * from carros join pessoas where pesNome like '%?%' and car_pesCod=pesCod order by car_pesCod;";
        // cria o ArrayList
        ArrayList<Carro> lista = null;
        try {
            // prepared statement para inserção
            PreparedStatement stmt = con.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, nomeDono);

            // executa
            ResultSet rs = stmt.executeQuery();

            //cria a lista
            while (rs.next()) {
                Carro carro = new Carro(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                carro.setCod(rs.getInt(1));
                lista.add(carro);
            }
            // fecha a conexão
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    private void addDono(int idCarro, int idDono) {
        // cria a query
        String sql = "insert into Carros_Pessoas (ccl_carCod,ccl_pesCod) values" + "(" + idCarro + "," + idDono + ");";

        try {
            // prepara o statement
            PreparedStatement stmt = con.prepareStatement(sql);

            // executa
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
