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

    public static void main(String[] args) {
        //geraRelatorioServicosPeriodo("2016-07-17", "2016-07-30");
        geraRelatorioOs(15);
    }

    public static void geraRelatorio(String jrxml, HashMap param) {
        try {
            SimpleDateFormat dt = new SimpleDateFormat("dd-mm-yyyy");
            Connection con = getConnection();
            Map parameters = param;
            JasperReport report = JasperCompileManager.compileReport("src/relatorios/" + jrxml + ".jrxml");
            JasperPrint impressao = JasperFillManager.fillReport(report, parameters, con);
            JasperExportManager.exportReportToPdfFile(impressao, "relatorios/" + jrxml + "-" + dt.format(Calendar.getInstance().getTime()) + ".pdf");
            File arquivo = new File("relatorios/" + jrxml + "-" + dt.format(Calendar.getInstance().getTime()) + ".pdf");
            Desktop.getDesktop().open(arquivo);
        } catch (IOException | JRException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Gerar o Relatório, " + e.getMessage(), "Erro", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e.getMessage());
        }

    }

    public static void geraRelatorioOs(int cliCod) {
        HashMap params = new HashMap<>();
        params.put("cliCod", params);
        geraRelatorio("oscliente", params);
    }
    public static void geraRelatorioOrcamento(int osCod){
        HashMap params = new HashMap<>();
        params.put("osCod", osCod);
        geraRelatorio("orcamento", params);
    }

    public static void geraRelatorioServicosPeriodo(String dataInicial, String dataFinal) {
        HashMap<String, String> params = new HashMap<>();
        params.put("dataInicial", dataInicial);
        params.put("dataFinal", dataFinal);
        geraRelatorio("servicosdata", params);
    }

    public static void geraRelatorioServicos() {
        geraRelatorio("listaservicos", null);
    }

}
