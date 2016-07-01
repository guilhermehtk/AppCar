package model;

import java.sql.Timestamp;

public class OrdemServico {

    private int cod;
    private String tipo;
    private Timestamp data;
    private String situacao;
    private String descricao;
    private int cliCod;
    private int carCod;

    public OrdemServico(String tipo, String situacao, String descricao, int carCod, int cliCod) {
        this.tipo = tipo;
        this.situacao = situacao;
        this.descricao = descricao;
        this.cliCod = cliCod;
        this.carCod = carCod;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCliCod() {
        return cliCod;
    }

    public void setCliCod(int cliCod) {
        this.cliCod = cliCod;
    }

    public int getCarCod() {
        return carCod;
    }

    public void setCarCod(int carCod) {
        this.carCod = carCod;
    }

}
