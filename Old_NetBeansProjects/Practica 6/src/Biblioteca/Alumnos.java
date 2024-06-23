package Biblioteca;

public class Alumnos {

private int Registro;
private String Nombre;
private String Hora;
private String VC;

    public Alumnos() {
        this.Registro = 00;
        this.Nombre = "";
        this.Hora = "";
        this.VC = "";
    }

    public int getRegistro() {
        return Registro;
    }

    public void setRegistro(int Registro) {
        this.Registro = Registro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getVC() {
        return VC;
    }

    public void setVC(String VC) {
        this.VC = VC;
    }

}
