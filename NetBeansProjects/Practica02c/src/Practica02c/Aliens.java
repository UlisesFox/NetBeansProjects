package Practica02c;

public class Aliens {
    private String Nombre;
    private String Especie; 
    private String Color; 
    private String Comportamiento;

    public Aliens(String Nombre, String Especie, String Color, String Comportamiento) {
        this.Nombre = Nombre;
        this.Especie = Especie;
        this.Color = Color;
        this.Comportamiento = Comportamiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getComportamiento() {
        return Comportamiento;
    }

    public void setComportamiento(String Comportamiento) {
        this.Comportamiento = Comportamiento;
    }
}
