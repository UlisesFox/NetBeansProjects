import javax.swing.JOptionPane;
//Clase
public class evento {
    private String fecha;
    private String hora;
    private String lugar;
    private int capacidad;
    private double costoBoleto;
    public tren transporte = new tren();

//Constructor
    public evento(String fecha, String hora, String lugar, int capacidad, double costoBoleto){
        this.fecha=fecha;
        this.hora=hora;
        this.lugar=lugar;
        this.capacidad=capacidad;
        this.costoBoleto=costoBoleto;
    }
    public evento(){
    }
//Metodos
    public void setFecha(String fecha){
        this.fecha=fecha;    
    }
    public void setHora(String hora){
        this.hora=hora;
    }
    public void setLugar(String lugar){
        this.lugar=lugar;
    }
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }
    public void setCostoBoleto(double costoBoleto){
        this.costoBoleto=costoBoleto;
    }
    public String getFecha(){
        return fecha;
    }
    public String getHora(){
        return hora;
    }
    public String getLugar(){
        return lugar;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public double getcostoBoleto(){
        return costoBoleto;
    }
    public void mostrarElementos(){
        JOptionPane.showMessageDialog(null, "\nfecha: " + fecha + "\nhora: " + hora + "\nlugar: "+ lugar + "\ncapacidad: " + capacidad + "\ncosto Boleto: " + costoBoleto);
    }
}