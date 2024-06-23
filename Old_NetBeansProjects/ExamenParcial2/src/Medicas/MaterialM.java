package Medicas;

public class MaterialM {

private int CantidadQ;   //Cantidad de Material Quirurgico
private int CantidadM;   //Cantidad de Medicina
private int CantidadS;   //Cantidad Salas Medicas
private int CantidadSP;  //Cantidad de material pandemico

    public MaterialM(int CantidadQ, int CantidadM, int CantidadS, int CantidadSP) {
        this.CantidadQ = CantidadQ;
        this.CantidadM = CantidadM;
        this.CantidadS = CantidadS;
        this.CantidadSP = CantidadSP;
    }

    public int getCantidadQ() {
        return CantidadQ;
    }

    public void setCantidadQ(int CantidadQ) {
        this.CantidadQ = CantidadQ;
    }

    public int getCantidadM() {
        return CantidadM;
    }

    public void setCantidadM(int CantidadM) {
        this.CantidadM = CantidadM;
    }

    public int getCantidadS() {
        return CantidadS;
    }

    public void setCantidadS(int CantidadS) {
        this.CantidadS = CantidadS;
    }

    public int getCantidadSP() {
        return CantidadSP;
    }

    public void setCantidadSP(int CantidadSP) {
        this.CantidadSP = CantidadSP;
    }
}