package Practica02a;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
                 
        Scanner reader = new Scanner(System.in);
        Cita cita = new Cita("null", "null", "null", 0);
         int ope, ope2, p;
         String n, f, t;
         boolean op = true;
         boolean op2 = true;
        
        while(op){
         
        System.out.println("\nAgenda de Citas Hospital Vallarta");          
        System.out.println("1. Registarar");
        System.out.println("2. Editar");
        System.out.println("3. Imprimir");
        System.out.println("4. Salida");
        System.out.print("\nSeleccione una opccion: ");
        ope = reader.nextInt();
        
        if (ope == 4){
                  System.out.println("\nSaliendo......");
                  break;
        } else {
 
	switch(ope) {
                          case 1:
                              System.out.println("\nRegsitro de Citas");
                              System.out.print("Introdusca Nombre de pasiente: ");
                              n = reader.next();
                              cita.setNombre(n);   
                              System.out.print("Introdusca Fecha de cita: ");
                              f = reader.next();
                              cita.setFecha(f);
                              System.out.print("Introdusca Tipo de cita: ");
                              t = reader.next();
                              cita.setTipo(t);                              
                              System.out.print("Introdusca Precio de cita: ");
                              p = reader.nextInt();
                              cita.setPrecio(p);
                          break;
                          
                          case 2:
                                {
                                    while(op2){
                                        System.out.println("\nSelector de ediccion de datos de Cita");          
                                        System.out.println("1. Nombre de pasiente");
                                        System.out.println("2. Fecha de cita");
                                        System.out.println("3. Tipo de cita");
                                        System.out.println("4. Precio de cita");                                        
                                        System.out.println("5. Regresar");
                                        System.out.print("\nSeleccione una opccion: ");
                                        ope2 = reader.nextInt();
        
                                        if (ope2 == 5){
                                                System.out.println("\nRegresando......");
                                                break;
                                        } else {
                                                switch(ope2){
                                                    case 1:
                                                        System.out.print("\nIntrodusca nuevo Nombre de pasiente: ");
                                                        n = reader.next();
                                                        cita.setNombre(n);   
                                                    break;
                                                                                                        
                                                    case 2:
                                                        System.out.print("\nIntrodusca nueva Fecha de cita: ");
                                                        f = reader.next();
                                                        cita.setFecha(f);
                                                    break;
                                                                                                        
                                                    case 3:
                                                        System.out.print("\nIntrodusca nuevo Tipo de cita: ");
                                                        t = reader.next();
                                                        cita.setTipo(t);  
                                                    break;
                                                                                                        
                                                    case 4:
                                                        System.out.print("\nIntrodusca nuevo Precio de cita: ");
                                                        p = reader.nextInt();
                                                        cita.setPrecio(p);
                                                    break;
                                                    
                                                    default:
                                                             System.out.printf("\nError la opccion es incorrecta");     
                                                                                                        
                                            }
                                        }
                                    }
                                }
                          break;
                          
                          case 3:
                              System.out.println("\nDatos de Cita");
                              System.out.println("Nombre del pasiente: "+cita.getNombre());
                              System.out.println("Fecha de Cita: "+cita.getFecha());
                              System.out.println("Tipo de Cita: "+cita.getTipo());
                              System.out.println("Precio de Cita: $"+cita.getPrecio());
                          break;

                          default:
                                   System.out.printf("\nError la opccion es incorrecta");                                               
                }                                   
            }  
        }
    }
}