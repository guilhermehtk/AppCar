package relatorios;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import static model.dao.ConnectionFactory.getConnection;

public class GeraRelatório {

    public static void geraRelatorioOSCliente(String sql, String relatorio) {
        Connection con = getConnection();
        ResultSet rs;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            // executa
            rs = stmt.executeQuery();
            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            Map parameters = new HashMap();
            JasperViewer.viewReport(JasperFillManager.fillReport(relatorio, parameters, jrRS));
            // fecha a conexão
            stmt.close();
        } catch (SQLException | JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar o relatório, " + e.getMessage(), "Erro", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e.getMessage());
        }

    }

}
