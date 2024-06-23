package DDTECH;

public class NodoPila {

    private Valoraciones Valoracione;
    private Quejas Queja;
    private Tarjetas Tarjeta;
    private Productos Producto;
    private Datos Dato;
    private int CN;
    private NodoPila aptsig;

    public NodoPila() {
        
        this.aptsig = null;
        CN = 0;
    }

    public NodoPila getAptsig() {
        return aptsig;
    }

    public void setAptsig(NodoPila aptsig) {
        this.aptsig = aptsig;
    }   

    public Productos getProducto() {
        return Producto;
    }

    public void setProducto(Productos Producto) {
        this.Producto = Producto;
    }

    public Quejas getQueja() {
        return Queja;
    }

    public void setQueja(Quejas Queja) {
        this.Queja = Queja;
    }

    public Tarjetas getTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(Tarjetas Tarjeta) {
        this.Tarjeta = Tarjeta;
    }

    public Valoraciones getValoracione() {
        return Valoracione;
    }

    public void setValoracione(Valoraciones Valoracione) {
        this.Valoracione = Valoracione;
    }

    public Datos getDato() {
        return Dato;
    }

    public void setDato(Datos Dato) {
        this.Dato = Dato;
    }
}
