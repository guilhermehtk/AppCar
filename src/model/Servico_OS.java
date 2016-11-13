package model;

public class Servico_OS {

    private int cod;
    private int svcCod;
    private int osCod;
    private int mecCod;

    public Servico_OS(int svcCod, int osCod, int mecCod) {
        this.svcCod = svcCod;
        this.osCod = osCod;
        this.mecCod = mecCod;
    }
    
    public Servico_OS(){
        
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getSvcCod() {
        return svcCod;
    }

    public void setSvcCod(int svcCod) {
        this.svcCod = svcCod;
    }

    public int getOsCod() {
        return osCod;
    }

    public void setOsCod(int osCod) {
        this.osCod = osCod;
    }

    public int getMecCod() {
        return mecCod;
    }

    public void setMecCod(int mecCod) {
        this.mecCod = mecCod;
    }

}
