package ServicioDeViajes;

public class Cotización {

private int Dias;
private String Destino;
private String Habitacion;
private String TipoPago;
private int Subtotal;
private int IVA;
private int TotalPagar;
private int mensualidad;
private Cotización siguiente;

    public Cotización() {
        this.Dias = 1;
        this.Destino = "";
        this.Habitacion = "";
        this.TipoPago = "";
        this.Subtotal = 2;
        this.IVA = 3;
        this.TotalPagar = 4;
        this.mensualidad = 5;
        this.siguiente = siguiente;
    }

    public int getDias() {
        return Dias;
    }

    public void setDias(int Dias) {
        this.Dias = Dias;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }

    public String getTipoPago() {
        return TipoPago;
    }

    public void setTipoPago(String TipoPago) {
        this.TipoPago = TipoPago;
    }

    public int getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(int Subtotal) {
        this.Subtotal = Subtotal;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public int getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(int TotalPagar) {
        this.TotalPagar = TotalPagar;
    }

    public int getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(int mensualidad) {
        this.mensualidad = mensualidad;

    }

    public Cotización getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cotización siguiente) {
        this.siguiente = siguiente;
    }
}
