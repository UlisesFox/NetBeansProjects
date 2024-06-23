package DDTECH;

public class NodoLista {
    //Atributtos
    private NodoLista aptSiguiente;
    Quejas que;
    Productos Pro;
    //Constructor
    NodoLista(Quejas que){
        this.aptSiguiente = null;
        this.que = que;
    }

    NodoLista(Productos Pro){
        this.aptSiguiente = null;
        this.Pro = Pro;
    }
    //Getters y Setters
    public Quejas getQue() {
        return que;
    }

    public void setQue(Quejas que) {
        this.que = que;
    }

    public Productos getPro() {
        return Pro;
    }

    public void setPro(Productos Pro) {
        this.Pro = Pro;
    }

    public NodoLista getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(NodoLista aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }
}
