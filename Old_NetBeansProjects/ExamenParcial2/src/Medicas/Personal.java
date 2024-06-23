package Medicas;

public class Personal {
    
private int Codigo;
private int NumeroC;    //Numero de Condultas
private int AñosS;      //Años en servicio
private int Diplomas;

    public Personal(int Codigo, int NumeroC, int AñosS, int Diplomas) {
        this.Codigo = Codigo;
        this.NumeroC = NumeroC;
        this.AñosS = AñosS;
        this.Diplomas = Diplomas;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getNumeroC() {
        return NumeroC;
    }

    public void setNumeroC(int NumeroC) {
        this.NumeroC = NumeroC;
    }

    public int getAñosS() {
        return AñosS;
    }

    public void setAñosS(int AñosS) {
        this.AñosS = AñosS;
    }

    public int getDiplomas() {
        return Diplomas;
    }

    public void setDiplomas(int Diplomas) {
        this.Diplomas = Diplomas;
    }
}
