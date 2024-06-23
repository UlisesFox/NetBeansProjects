package Biblioteca;

public class Libro {

private int CodigoL;
private String NombreL;
private String Genero;
private int NumeroPag;

    public Libro() {
        this.CodigoL = 00;
        this.NombreL = "";
        this.Genero = "";
        this.NumeroPag = 00;
    }

    public int getCodigoL() {
        return CodigoL;
    }

    public void setCodigoL(int CodigoL) {
        this.CodigoL = CodigoL;
    }

    public String getNombreL() {
        return NombreL;
    }

    public void setNombreL(String NombreL) {
        this.NombreL = NombreL;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getNumeroPag() {
        return NumeroPag;
    }

    public void setNumeroPag(int NumeroPag) {
        this.NumeroPag = NumeroPag;
    }
    
}
