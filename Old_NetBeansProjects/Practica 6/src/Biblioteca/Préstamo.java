package Biblioteca;

public class Préstamo {

private String FechaP;
private String FechaR;
private String Prorroga;
private String Incumpli;

    public Préstamo() {
        this.FechaP = "";
        this.FechaR = "";
        this.Prorroga = "";
        this.Incumpli = "";
    }

    public String getFechaP() {
        return FechaP;
    }

    public void setFechaP(String FechaP) {
        this.FechaP = FechaP;
    }

    public String getFechaR() {
        return FechaR;
    }

    public void setFechaR(String FechaR) {
        this.FechaR = FechaR;
    }

    public String getProrroga() {
        return Prorroga;
    }

    public void setProrroga(String Prorroga) {
        this.Prorroga = Prorroga;
    }

    public String getIncumpli() {
        return Incumpli;
    }

    public void setIncumpli(String Incumpli) {
        this.Incumpli = Incumpli;
    }

}
