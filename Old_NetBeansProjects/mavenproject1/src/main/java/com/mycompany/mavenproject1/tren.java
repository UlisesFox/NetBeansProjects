import javax.swing.JOptionPane;
//Clase
public class tren extends transporte {
    private String modelo;
    private String vagones;

//Constructor
public tren(String tipo, String color, String combustible, String modelo, String vagones){
    super(tipo,color,combustible);
    this.modelo=modelo;
    this.vagones=vagones;
}
public tren(){
}

//Metodos
    public void setModelo (String modelo){
        this.modelo=modelo;
    }
    public void setVagones (String vagones){
        this.vagones=vagones;
    }
    public String getModelo (){
        return modelo;
    }
    public String getVagones (){
        return vagones;
        
    }
    public void mostrarElementos(){
        JOptionPane.showMessageDialog(null, "\ntipo:" + tipo + "\ncolor:" + color + "\ncombustible" + combustible + "\nmodelo:" + modelo + "\nvagones:" + vagones);
            
        }
    }