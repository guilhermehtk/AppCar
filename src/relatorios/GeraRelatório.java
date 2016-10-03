package relatorios;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import static model.dao.ConnectionFactory.getConnection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class GeraRelatório {

    private String sql = "select\n"
            + "    OrdemServicos.osCod,\n"
            + "    OrdemServicos.osTipo,\n"
            + "    OrdemServicos.osData,\n"
            + "    sum(Servicos.svcValor)\n"
            + "from\n"
            + "    OrdemServicos\n"
            + "join\n"
            + "    Servicos_OS\n"
            + "join\n"
            + "    Servicos\n"
            + "where\n"
            + "    ser_osCod = osCod and\n"
            + "    ser_svcCod = svcCod\n"
            + " and os_cliCod=15 "
            + "group by\n"
            + "   osCod;";

    public static void main(String[] args) {
        geraRelatorioOSCliente("SELECT * from servicos;", "servico");
    }

    public static void geraRelatorioOSCliente(String sql, String relatorio) {
        Connection con = getConnection();
        ResultSet rs;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            // executa
            rs = stmt.executeQuery();

            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
            Map parameters = new HashMap();

            JasperReport report = JasperCompileManager.compileReport("src/relatorios/" + relatorio + ".jrxml");
            JasperPrint impressao = JasperFillManager.fillReport(report, parameters, jrRS);

            SimpleDateFormat dt = new SimpleDateFormat("dd-mm-yyyy");
            JasperExportManager.exportReportToPdfFile(impressao, relatorio + dt.format(Calendar.getInstance().getTime()) + ".pdf");

            // fecha a conexão
            stmt.close();
        } catch (SQLException | JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar o relatório, " + e.getMessage(), "Erro", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e.getMessage());
        }

        try {
            SimpleDateFormat dt = new SimpleDateFormat("dd-mm-yyyy");
            File arquivo = new File(relatorio + dt.format(Calendar.getInstance().getTime()) + ".pdf");
            Desktop.getDesktop().open(arquivo);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o relatório, " + ex.getMessage(), "Erro", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(ex.getMessage());
        }

    }

}
