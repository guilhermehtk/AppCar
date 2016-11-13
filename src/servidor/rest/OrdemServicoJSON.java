package servidor.rest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import model.OrdemServico;
import servidor.json.JSONArray;
import servidor.json.JSONException;
import servidor.json.JSONObject;

public class OrdemServicoJSON {

    public static OrdemServico getOrdemServicoJSON(JSONObject json) {
        //instancia vetor de oss
        OrdemServico os = new OrdemServico();
        try {
            //pega do json os registros da tag os
            JSONArray vetor = (JSONArray) json.get("OrdemServico");
            JSONObject object = (JSONObject) vetor.get(0);
            os.setCod(object.getInt("osCod"));
            os.setCliCod(object.getInt("os_cliCod"));
            os.setCarCod(object.getInt("os_carCod"));
            os.setData(Timestamp.valueOf(object.getString("osData")));
            os.setSituacao(object.getInt("osSituacao"));
            os.setTipo(object.getString("osTipo"));
            os.setDescricao(object.getString("osDescricao"));
           
        } catch (Exception x) {
        }
        return os;
    }

    public static String geraJSONOrdemServicos(ArrayList<OrdemServico> ordens) {
        ArrayList<JSONObject> tabelaOrdemServicos = new ArrayList<>();
        JSONObject registro;
        //cria um registro primeiro
        for (OrdemServico os : ordens) {
            registro = new JSONObject();
            try {
                registro.put("osCod", os.getCod());
                registro.put("os_cliCod", os.getCliCod());
                registro.put("os_carCod", os.getCarCod());
                registro.put("osData", os.getData().toString());
                registro.put("osDescricao", os.getDescricao());
                registro.put("osSituacao", os.getSituacao());
                registro.put("osTipo", os.getTipo());

            } catch (JSONException k) {
            }
            //adiciona registro à lista de registros
            tabelaOrdemServicos.add(registro);
        }

        //adiciona tabela
        JSONObject bd = new JSONObject();
        try {
            bd.putOpt("os", (Object) tabelaOrdemServicos);
        } catch (JSONException u) {
        }
        return UtilJSON.limpaJSON(bd);
    }

}
