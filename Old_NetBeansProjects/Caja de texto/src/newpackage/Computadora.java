package newpackage;

public class Computadora {
    
    private int serie;
    private String marca;
    private String modelo;
    private float procesador;
    private int ram;

        public Computadora(int serie, String marca, String modelo, float procesador, int ram) {
            this.serie = 123;
            this.marca = "patito";
            this.modelo = "abc";
            this.procesador = 5.7f;
            this.ram = 16;
        }

    Computadora() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
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

    public float getProcesador() {
        return procesador;
    }

    public void setProcesador(float procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}
