package model;

public class Servico {
    private int cod;
    private String descricao;
    private int osCod;
    private double valor;

    public Servico(String descricao,double valor, int osCod) {
        this.descricao = descricao;
        this.osCod = osCod;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public int getOsCod() {
        return osCod;
    }

    public void setOsCod(int osCod) {
        this.osCod = osCod;
    }

}
