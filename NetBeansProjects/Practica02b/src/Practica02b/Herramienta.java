package Practica02b;

public class Herramienta {
    
    private String marca;
    private String modelo; 
    private int codigo; 
    private int costo;

    public Herramienta(String marca, String modelo, int codigo, int costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCódigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
