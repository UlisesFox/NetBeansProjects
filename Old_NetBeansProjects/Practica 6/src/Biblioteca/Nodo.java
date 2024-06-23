package Biblioteca;

public class Nodo {

    private Alumnos Alumno;
    private Préstamo prestamo;
    private Libro libro;
    private int CN;
    private Nodo aptsig;

    public Nodo() {
        
        this.aptsig = null;
        CN = 0;
    }

    public Nodo getAptsig() {
        return aptsig;
    }

    public void setAptsig(Nodo aptsig) {
        this.aptsig = aptsig;
    }   

    public Alumnos getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumnos Alumno) {
        this.Alumno = Alumno;
    }

    public Préstamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Préstamo prestamo) {
        this.prestamo = prestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
