package model;

import java.sql.Timestamp;

public class OrdemServico {

    private int cod;
    private String tipo;
    private Timestamp data;
    private double valor;
    private int cliCod;
    private int mecCod;

    public OrdemServico(String tipo, int cliCod, int mecCod) {
        this.tipo = tipo;
        this.data = new Timestamp(System.currentTimeMillis());
        this.cliCod = cliCod;
        this.mecCod = mecCod;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCliCod() {
        return cliCod;
    }

    public void setCliCod(int cliCod) {
        this.cliCod = cliCod;
    }

    public int getMecCod() {
        return mecCod;
    }

    public void setMecCod(int mecCod) {
        this.mecCod = mecCod;
    }

}
