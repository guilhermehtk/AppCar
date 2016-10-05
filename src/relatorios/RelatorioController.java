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
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class RelatorioController {

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
        geraRelatorioServicosPeriodo("2016-07-17", "2016-07-30");
    }

    public static void geraRelatorio(String jrxml, String nomeArquivo, HashMap param) {
        try {
            SimpleDateFormat dt = new SimpleDateFormat("dd-mm-yyyy");
            Connection con = getConnection();
            Map parameters = param;
            JasperReport report = JasperCompileManager.compileReport("src/relatorios/" + jrxml + ".jrxml");
            JasperPrint impressao = JasperFillManager.fillReport(report, parameters, con);
            JasperExportManager.exportReportToPdfFile(impressao, jrxml + "-" + dt.format(Calendar.getInstance().getTime()) + ".pdf");
            File arquivo = new File("relatorios/" + nomeArquivo + "-" + dt.format(Calendar.getInstance().getTime()) + ".pdf");
            Desktop.getDesktop().open(arquivo);
        } catch (IOException | JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Gerar o Relatório, " + e.getMessage(), "Erro", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e.getMessage());
        }

    }

    public static void geraRelatorioServicosPeriodo(String dataInicial, String dataFinal) {
        HashMap<String, String> params = new HashMap<>();
        params.put("dataInicial", dataInicial);
        params.put("dataFinal", dataFinal);
        geraRelatorio("servicosdata", "ServicosRealizados", params);
    }

    public static void geraRelatorioServicos() {
        geraRelatorio("listaservicos", "ListaDeServicos", null);
    }

}
