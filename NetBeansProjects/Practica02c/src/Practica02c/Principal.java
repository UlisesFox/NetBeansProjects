package Practica02c;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
        Aliens A = new Aliens("null", "null","null", "null");
        AliensAtributos AA = new AliensAtributos(0, 0, 0, 0);
         int ope, ope2, u, k, j, l;
         String n, f, t, p;
         boolean op = true;
         boolean op2 = true;
        
        while(op){
         
        System.out.println("\nRegistro de Aliens");          
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
                              System.out.println("\nRegistro de Aliens");
                              System.out.print("Introdusca Nomre de Alien: ");
                              n = reader.next();
                              A.setNombre(n);   
                              System.out.print("Introdusca Especie de Alien: ");
                              f = reader.next();
                              A.setEspecie(f);
                              System.out.print("Introdusca Color de Alien: ");
                              t = reader.next();
                              A.setColor(t);                              
                              System.out.print("Introdusca Comportamiento de Alien: ");
                              p = reader.next();
                              A.setComportamiento(p);
                              System.out.print("Introdusca HP de Alien: ");
                              u = reader.nextInt();
                              AA.setHP(u);
                              System.out.print("Introdusca Velocidad de Alien: ");
                              l = reader.nextInt();
                              AA.setVelocidad(l);
                              System.out.print("Introdusca Resistencia de Alien: ");
                              k = reader.nextInt();
                              AA.setResistencia(k);
                              System.out.print("Introdusca Ejercito de Alien: ");
                              j = reader.nextInt();
                              AA.setEjercito(j);
                          break;
                          
                          case 2:
                                {
                                    while(op2){
                                        System.out.println("\nSelector de ediccion de datos de Aliens");          
                                        System.out.println("1. Nomre de Alien");
                                        System.out.println("2. Especie de Alien");
                                        System.out.println("3. Color de Alien");
                                        System.out.println("4. Comportamiento de Alien");                                        
                                        System.out.println("5. HP de Alien");
                                        System.out.println("6. Velocidad de Alien");
                                        System.out.println("7. Resistencia de Alien");
                                        System.out.println("8. Ejercito de Alien");
                                        System.out.println("9. Regresar");
                                        System.out.print("\nSeleccione una opccion: ");
                                        ope2 = reader.nextInt();
        
                                        if (ope2 == 9){
                                                System.out.println("\nRegresando......");
                                                break;
                                        } else {
                                                switch(ope2){
                                                    case 1:
                                                        System.out.print("\nIntrodusca nueva Nomre de Alien: ");
                                                        n = reader.next();
                                                        A.setNombre(n); 
                                                    break;
                                                                                                        
                                                    case 2:
                                                        System.out.print("\nIntrodusca nueva Especie de Alien: ");
                                                        f = reader.next();
                                                        A.setEspecie(f);
                                                    break;
                                                                                                        
                                                    case 3:
                                                        System.out.print("\nIntrodusca nuevo Color de Alien: ");
                                                        t = reader.next();
                                                        A.setColor(t);  
                                                    break;
                                                                                                        
                                                    case 4:
                                                        System.out.print("\nIntrodusca nuevo Comportamiento de Alien: ");
                                                        p = reader.next();
                                                        A.setComportamiento(p);
                                                    break;
                                                    
                                                    case 5:
                                                        System.out.print("\nIntrodusca nuevo HP de Alien: ");
                                                        u = reader.nextInt();
                                                        AA.setHP(u);
                                                    break;
                                                    
                                                    case 6:
                                                        System.out.print("\nIntrodusca nueva Velocidad de Alien: ");
                                                        l = reader.nextInt();
                                                        AA.setVelocidad(l);
                                                    break;
                                                    
                                                    case 7:
                                                        System.out.print("\nIntrodusca nueva Resistencia de Alien: ");
                                                        k = reader.nextInt();
                                                        AA.setResistencia(k);
                                                    break;
                                                    
                                                    case 8:
                                                        System.out.print("\nIntrodusca nueva Ejercito de Alien: ");
                                                        k = reader.nextInt();
                                                        AA.setEjercito(k);
                                                    break;
                                                    
                                                    default:
                                                             System.out.printf("\nError la opccion es incorrecta");                                                          
                                            }
                                        }
                                    }
                                }
                          break;
                          
                          case 3:
                              System.out.println("\nDatos de Aliens");
                              System.out.println("Nombre de Alien: "+A.getNombre());
                              System.out.println("Especie de Alien: "+A.getEspecie());
                              System.out.println("Color de Alien: "+A.getColor());
                              System.out.println("Comportamiento de Alien: "+A.getComportamiento());
                              System.out.println("HP de Alien: "+AA.getHP()+ " Kg");
                              System.out.println("Velocidad de Alien: "+AA.getVelocidad()+" m");
                              System.out.println("Resistencia de Alien: "+AA.getResistencia());
                              System.out.println("Ejercito de Alien: "+AA.getEjercito());

                          default:
                                   System.out.printf("\nError la opccion es incorrecta");                                               
                }                                   
            }  
        }
    }
}