package DDTECH;

public class Valoraciones {

private String Apodo;
private String Puntuación;
private String Comentario;
private String PersonaD;
private String Recomendación;

    public Valoraciones() {
        this.Apodo = "";
        this.Puntuación = "";
        this.Comentario = "";
        this.PersonaD = "";
        this.Recomendación = "";
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public String getPuntuación() {
        return Puntuación;
    }

    public void setPuntuación(String Puntuación) {
        this.Puntuación = Puntuación;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public String getPersonaD() {
        return PersonaD;
    }

    public void setPersonaD(String PersonaD) {
        this.PersonaD = PersonaD;
    }

    public String getRecomendación() {
        return Recomendación;
    }

    public void setRecomendación(String Recomendación) {
        this.Recomendación = Recomendación;
    }
}