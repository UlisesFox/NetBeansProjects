/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseGUI03;

/**
 *
 * @author yazminurzuac
 */
public class Viaje {
    //Atributos
    private int numero;
    private String pais;
    private String ciudad;
    //Apuntador a la siguiente estructura
    private Viaje siguiente;
    
    //Métodos
    //Constructor
   /* public Viaje(int numero, String pais, String ciudad) {
        this.numero = numero;
        this.pais = pais;
        this.ciudad = ciudad;
      
    }*/
    //Constructor
    public Viaje() {
        this.numero = -1;
        this.pais = "";
        this.ciudad = "";
        this.siguiente = null;
    }
    
    //Get's y Set's

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Viaje getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Viaje siguiente) {
        this.siguiente = siguiente;
    }
    
    
}//Clase
