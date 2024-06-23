package Practica02b;

public class HerramientaMecánica {
    
    private int peso;
    private String tamaño;
    private int dimensiones1;
    private int dimensiones2;

    public HerramientaMecánica(int peso, String tamaño, int dimensiones1, int dimensiones2) {
        this.peso = peso;
        this.tamaño = tamaño;
        this.dimensiones1 = dimensiones1;
        this.dimensiones2 = dimensiones2;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getDimensiones1() {
        return dimensiones1;
    }

    public void setDimensiones1(int dimensiones1) {
        this.dimensiones1 = dimensiones1;
    }
    
    public int getDimensiones2() {
        return dimensiones2;
    }

    public void setDimensiones2(int dimensiones2) {
        this.dimensiones2 = dimensiones2;
    }
}
