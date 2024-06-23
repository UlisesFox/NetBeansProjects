package DDTECH;

public class Tarjetas {

private String Tarjeta;
private String Transacción;
private String EntregaT;
private int CodigoP;
private String PagoT;

    public Tarjetas() {
        this.Tarjeta = "";
        this.Transacción = "";
        this.EntregaT = "";
        this.CodigoP = 00000;
        this.PagoT = "";
    }

    public String getTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(String Tarjeta) {
        this.Tarjeta = Tarjeta;
    }

    public String getTransacción() {
        return Transacción;
    }

    public void setTransacción(String Transacción) {
        this.Transacción = Transacción;
    }

    public String getEntregaT() {
        return EntregaT;
    }

    public void setEntregaT(String EntregaT) {
        this.EntregaT = EntregaT;
    }

    public int getCodigoP() {
        return CodigoP;
    }

    public void setCodigoP(int CodigoP) {
        this.CodigoP = CodigoP;
    }

    public String getPagoT() {
        return PagoT;
    }

    public void setPagoT(String PagoT) {
        this.PagoT = PagoT;
    }
}