package Practica02a;

public class Cita {
    
    public String nombre;
    public String fecha;
    public String tipo;
    public int precio;
    
    public Cita(String nombre, String fecha, String tipo, int precio) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
