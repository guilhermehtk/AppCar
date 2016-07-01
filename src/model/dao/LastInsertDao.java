package model.dao;

import static model.dao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LastInsertDao {

    private Connection con;

    public LastInsertDao() {
        this.con = getConnection();
    }

    public int getLastInsert() {
        // cria a query
        String sql = "SELECT LAST_INSERT_ID()";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            //pega resultado
            while (rs.next()) {
                return rs.getInt(1);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
