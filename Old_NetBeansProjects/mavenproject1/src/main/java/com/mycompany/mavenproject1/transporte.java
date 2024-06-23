//Clase
public class transporte {
    protected String tipo;
    protected String color;
    protected String combustible;

//Constructor
    public transporte(String tipo, String color, String combustible){
        this.tipo=tipo;
        this.color=color;
        this.combustible=combustible;
    }
    public transporte(){    
    }

//Metodo
    public void SetTipo (String tipo){
        this.tipo=tipo;
    }
    public void SetColor (String color){
        this.color=color;
    }
    public void SetCombustible (String combustible){
        this.combustible=combustible;
    }
    public String getTipo (){
        return tipo;
    }
    public String getColor (){
        return color;
    }
    public String getCombustible (){
        return combustible;
    }
}
