package practica_3;

public class Deportes {

    private float Codigo;
    private int NumeroCamisa;
    private String Estado;
    private int Goles;

        public Deportes(int Nombre, float NumeroCamisa, int Estado, int Goles) {
            this.Codigo = 332;
            this.NumeroCamisa = 123;
            this.Estado = "Estado";
            this.Goles = 123;
        }

    public Deportes(){

    }

    public float getCodigo() {
        return Codigo;
    }

    public void setCodigo(float Codigo) {
        this.Codigo = Codigo;
    }

    public int getNumeroCamisa() {
        return NumeroCamisa;
    }

    public void setNumeroCamisa(int NumeroCamisa) {
        this.NumeroCamisa = NumeroCamisa;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getGoles() {
        return Goles;
    }

    public void setGoles(int Goles) {
        this.Goles = Goles;
    }

}
