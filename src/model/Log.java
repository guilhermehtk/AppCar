package model;

import java.sql.Timestamp;

public class Log {

    private int cod;
    private String descricao;
    private Timestamp data;
    private int mecCod;

    public Log(String descricao, int mecCod) {
        this.descricao = descricao;
        this.data = new Timestamp(System.currentTimeMillis());
        this.mecCod = mecCod;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public int getMecCod() {
        return mecCod;
    }

    public void setMecCod(int mecCod) {
        this.mecCod = mecCod;
    }

}
