package ServicioDeViajes;

public class Usuario {

private String usuario;
private String contraseña;

    public Usuario(String usuario, String contraseña) {
        this.usuario = "invitado";
        this.contraseña = "OwO";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
