package Interface;

import java.time.Clock;
import java.util.Scanner;

public class Interface {

    public static void main(String[] args) {

         Scanner reader = new Scanner(System.in);
         Cal rep = new Implementacion();
         int f, s, res, ope;
         boolean op = true;
        
        while(op){
         
        System.out.println("\nCalculadora v0.1");          
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Mulriplicacion");
        System.out.println("4. Divicion");
        System.out.println("5. Potencia");
        System.out.println("6. Modulo");
        System.out.println("7. Salida");
        System.out.print("\nSeleccione una operacion: ");
        ope = reader.nextInt();
        
        if (ope == 7){
                  System.out.println("Saliendo......");
                  break;
        } else {
 
	switch(ope) {
                          case 1:
                                   System.out.print("Introdusca valor 1: ");
                                   f = reader.nextInt();
                                   System.out.print("Introdusca valor 2: ");
                                   s = reader.nextInt();
                                   res = rep.suma(f, s);
                                   System.out.print("El resultado es " + res + "\n");   
                          break;
                          
                          case 2:
                                   System.out.print("Introdusca valor 1: ");
                                   f = reader.nextInt();
                                   System.out.print("Introdusca valor 2: ");
                                   s = reader.nextInt();
                                   res = rep.resta(f, s);
                                   System.out.print("El resultado es " + res + "\n");                                    
                          break;
                          
                          case 3:
                                   System.out.print("Introdusca valor 1: ");
                                   f = reader.nextInt();
                                   System.out.print("Introdusca valor 2: ");
                                   s = reader.nextInt();
                                   res = rep.multi(f, s);
                                   System.out.print("El resultado es " + res + "\n");                                  
                          break;

                          case 4:
                                   System.out.print("Introdusca valor 1: ");
                                   f = reader.nextInt();
                                   System.out.print("Introdusca valor 2: ");
                                   s = reader.nextInt();
                                   res = rep.division(f, s);
                                   System.out.print("El resultado es " + res + "\n");                               
                          break;

                          case 5:
                                   System.out.print("Introdusca valor 1: ");
                                   f = reader.nextInt();
                                   System.out.print("Introdusca valor 2: ");
                                   s = reader.nextInt();
                                   res = rep.potencia(f, s);
                                   System.out.print("El resultado es " + res + "\n");                                   
                          break;

                          case 6:
                                   System.out.print("Introdusca valor 1: ");
                                   f = reader.nextInt();
                                   System.out.print("Introdusca valor 2: ");
                                   s = reader.nextInt();
                                   res = rep.modulo(f, s);
                                   System.out.print("El resultado es " + res + "\n");                                   
                          break;

                          default:
                                   System.out.printf("Error el operador es incorrecto");                                               
                          }                                   
                          }  
                 }
        }
}