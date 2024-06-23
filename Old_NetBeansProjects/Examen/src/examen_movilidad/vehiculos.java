package examen_movilidad;

public class vehiculos {

    private int Placas;
    private int Modelo;
    private String Estado;
    private String Marca;

    public vehiculos(int Placas, int Modelo, String Estado, String Marca) {
        this.Placas = 265;
        this.Modelo = 10;
        this.Estado = "Estado";
        this.Marca = "Ford";
    }

    vehiculos() {
        
    }

    public int getPlacas() {
        return Placas;
    }

    public void setPlacas(int Placas) {
        this.Placas = Placas;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
}
