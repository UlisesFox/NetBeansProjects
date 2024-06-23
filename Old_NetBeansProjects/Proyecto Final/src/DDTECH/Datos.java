package DDTECH;

public class Datos {

private String Nombre;
private String Género;
private int Edad;
private long Telefono;
private String Correo;
private String domi;

    public Datos() {
        this.Nombre = "";
        this.Género = "";
        this.Edad = 00;
        this.Telefono = 00;
        this.Correo = "";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGénero() {
        return Género;
    }

    public void setGénero(String Género) {
        this.Género = Género;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    } 

    public String getDomi() {
        return domi;
    }

    public void setDomi(String domi) {
        this.domi = domi;
    }
}
