package DDTECH;

public class Usuario {
    
private String NombreU;
private int Contraseña;

    public Usuario() {
        this.NombreU = null;
        this.Contraseña = 00;
    }

    public String getNombreU() {
        return NombreU;
    }

    public void setNombreU(String NombreU) {
        this.NombreU = NombreU;
    }

    public int getContraseña() {
        return Contraseña;
    }

    public void setContraseña(int Contraseña) {
        this.Contraseña = Contraseña;
    }
}