package Biblioteca;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenFondo extends JPanel{

    private Image imagen;
    private ImageIcon imagenIcon;
    
    public ImagenFondo(String ruta){
        
        imagenIcon = new ImageIcon(ruta);
        
    }

    public void  paint(Graphics g){
        
        imagen = imagenIcon.getImage();
        
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        
        setOpaque(false);
        
        super.paint(g);
    }
}
