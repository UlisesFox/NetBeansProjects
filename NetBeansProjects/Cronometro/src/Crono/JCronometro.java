package Crono;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCronometro extends JFrame implements ActionListener{
    
    private JLabel label;
    private JButton Inicio;
    private JButton Detener;
    
    static int hora = 0, min = 0, seg = 0;
    
    static boolean Hiloiniciar = true;
    static boolean ejecutando = false;
    
    public JCronometro(){
         initialize();
         setSize(228, 120);
         getContentPane().setLayout(null);
         setLocationRelativeTo(null);
    }
    
    private void initialize(){
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         label = new JLabel("00:00:00");
         label.setFont(new Font("Traditional Arabic", Font.PLAIN, 30));
         label.setBounds(47, 11, 137, 45);
         getContentPane().add(label);
         
         Inicio = new JButton("Iniciar");
         Inicio.setBounds(119, 54, 89, 23);
         Inicio.addActionListener(this);
         getContentPane().add(Inicio);
         
         Detener = new JButton("Detener");
         Detener.setBounds(10, 54, 89, 23);
         Detener.addActionListener(this);
         getContentPane().add(Detener);
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==Inicio){
             if(ejecutando==false){
                 Hiloiniciar=true;
                 ejecutando=true;
                 IniciarHiloCronometro();
             }
         }
         
         if(e.getSource()==Detener){
             ejecutando=false;
             Hiloiniciar=false;
         }
    }
    
    private void IniciarHiloCronometro(){
        if(Hiloiniciar==true){
                    System.out.println("Iniciar Cronometro");
                    Cronometro MiCrono = new Cronometro(label);
                    MiCrono.start();
        }
    }
}
