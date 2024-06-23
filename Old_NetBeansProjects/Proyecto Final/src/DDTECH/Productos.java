package DDTECH;

public class Productos {

private String CódigoP;
private String NombreP;
private int CantidadP;
private String EntregaP;
private String PagoP;

    public Productos() {
        this.CódigoP = "";
        this.NombreP = "";
        this.CantidadP = 00;
        this.EntregaP = "";
        this.PagoP = "";
    }

    public String getCódigoP() {
        return CódigoP;
    }

    public void setCódigoP(String CódigoP) {
        this.CódigoP = CódigoP;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public int getCantidad() {
        return CantidadP;
    }

    public void setCantidad(int CantidadP) {
        this.CantidadP = CantidadP;
    }

    public String getEntrega() {
        return EntregaP;
    }

    public void setEntrega(String EntregaP) {
        this.EntregaP = EntregaP;
    }

    public String getPago() {
        return PagoP;
    }

    public void setPago(String PagoP) {
        this.PagoP = PagoP;
    }
}