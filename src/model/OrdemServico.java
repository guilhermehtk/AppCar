package model;

import java.sql.Timestamp;

public class OrdemServico {

    private int cod;
    private String tipo;
    private Timestamp data;
    private int situacao;
    private int cliCod;
    private int carCod;

    public OrdemServico(String tipo, int situacao, int carCod, int cliCod) {
        this.tipo = tipo;
        this.situacao = situacao;
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

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
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
