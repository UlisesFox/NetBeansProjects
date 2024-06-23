package Crono;

import java.util.concurrent.ExecutionException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cronometro extends Thread {
    
    JLabel Cro;
    
    public Cronometro(JLabel cronometro){
         this.Cro=cronometro;
    }
    
    public  void run(){
        try {
            int x = 1;
            
            while(JCronometro.Hiloiniciar){
                  Thread.sleep(1000);
                  EjecutarHiloCrono(x);
                  x++;
            }
                    
        } catch (Exception e){
            System.out.println("Exception en el hilo: " +e.getMessage());
        }
    }

    private void EjecutarHiloCrono(int x) {
         System.out.println("tick= "+x);
         
         JCronometro.seg++;
         if(JCronometro.seg>59){
            JCronometro.seg=0;
                JCronometro.min++;
                //Para cambiar la cantidad de minutos antes de la pausa modificar "JCronometro.min>#" el arroba por un numero del 1 al 59
                if (JCronometro.min>1) {
                    System.out.println("Cronometro Detenido");
                    /*JCronometro.ejecutando=false;
                    JCronometro.Hiloiniciar=false;                    
                    JOptionPane.showMessageDialog(null, "Ya son los 2 minutos");*/
                    //E caso de querer horas solo borrar desde los "JCronometro.ejecutando=false" y descomentar lo de abajo
                    JCronometro.min=0;
                    JCronometro.hora++;
                    if (JCronometro.hora>24) {
                        JCronometro.hora=0;
                        JOptionPane.showMessageDialog(null, "Paso 1 dia");
                        
                 }
             }
         }
         
         String textSeg="", textMin="", textHora="";
         
         if(JCronometro.seg<10){
             textSeg="0"+JCronometro.seg;
         }else{
             textSeg=""+JCronometro.seg;
         }
         if(JCronometro.min<10){
             textMin="0"+JCronometro.min;
         }else{
             textMin=""+JCronometro.min;
         }
         if(JCronometro.hora<10){
             textHora="0"+JCronometro.hora;
         }else{
             textHora=""+JCronometro.hora;
         }         
         
         String reloj=textHora+":"+textMin+":"+textSeg;
         
         Cro.setText(reloj);
    }
}
