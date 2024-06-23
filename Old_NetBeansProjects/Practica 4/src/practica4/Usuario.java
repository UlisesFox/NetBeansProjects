package practica4;

public class Usuario {

String Usuario;
int contraseña;

    public Usuario(String Usuario, int contraseña) {
        this.Usuario = Usuario;
        this.contraseña = contraseña;
    }

    public String isUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
    
}
