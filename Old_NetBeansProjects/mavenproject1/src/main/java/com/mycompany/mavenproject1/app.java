import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        evento boleto = new evento();
        tren transporte = new tren();
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Registrar\n2. Editar\n3. Imprimir lista", JOptionPane.INFORMATION_MESSAGE));

            switch(opcion)
            {
                case 1:{
                boleto.setFecha(JOptionPane.showInputDialog(null, "Escribe la fecha de tu boleto: "));   
                boleto.setHora(JOptionPane.showInputDialog(null, "Escribe la hora de tu viaje: "));
                boleto.setLugar(JOptionPane.showInputDialog(null, "Escribe el lugar: "));
                boleto.setCapacidad(Integer.parseInt(JOptionPane.showInputDialog(null, "Digita la capacidad: ")));
                boleto.setCostoBoleto(Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el costo: ")));
                transporte.SetTipo(JOptionPane.showInputDialog(null, "Tipo de transporte: "));
                transporte.SetColor(JOptionPane.showInputDialog(null, "Color: "));
                transporte.SetCombustible(JOptionPane.showInputDialog(null, "Tipo de combustible: "));
                transporte.setModelo(JOptionPane.showInputDialog(null, "Modelo:"));
                transporte.setVagones(JOptionPane.showInputDialog(null, "Vagones"));
                break;
                }
                case 2:{
                    boleto.setFecha(JOptionPane.showInputDialog(null, "Escribe la fecha de tu boleto: "));   
                    boleto.setHora(JOptionPane.showInputDialog(null, "Escribe la hora de tu viaje: "));
                    boleto.setLugar(JOptionPane.showInputDialog(null, "Escribe el lugar: "));
                    boleto.setCapacidad(Integer.parseInt(JOptionPane.showInputDialog(null, "Digita la capacidad: ")));
                    boleto.setCostoBoleto(Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el costo: ")));
                    transporte.SetTipo(JOptionPane.showInputDialog(null, "Tipo de transporte: "));
                    transporte.SetColor(JOptionPane.showInputDialog(null, "Color: "));
                    transporte.SetCombustible(JOptionPane.showInputDialog(null, "Tipo de combustible: "));
                    transporte.setModelo(JOptionPane.showInputDialog(null, "Modelo:"));
                    transporte.setVagones(JOptionPane.showInputDialog(null, "Vagones"));
                break;
               }
                case 3:{
                    boleto.mostrarElementos();
                    transporte.mostrarElementos();
                break;
                }

                default:{

                break;
                }
            }
        }while(opcion != 0);
    }
}

    
}
