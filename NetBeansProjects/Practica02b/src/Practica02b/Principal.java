package Practica02b;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Herramienta He = new Herramienta("null", "null",0, 0);
        HerramientaMecánica HeMe = new HerramientaMecánica(0, "null", 0, 0);
         int ope, ope2, p, t, u, k, j;
         String n, f, l;
         boolean op = true;
         boolean op2 = true;
        
        while(op){
         
        System.out.println("\nRegistro de herramientas");          
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
                              System.out.println("\nRegistro de herramientas");
                              System.out.print("Introdusca Marca: ");
                              n = reader.next();
                              He.setMarca(n);   
                              System.out.print("Introdusca Modelo: ");
                              f = reader.next();
                              He.setModelo(f);
                              System.out.print("Introdusca Codigo: ");
                              t = reader.nextInt();
                              He.setCódigo(t);                              
                              System.out.print("Introdusca Precio: ");
                              p = reader.nextInt();
                              He.setCosto(p);
                              System.out.print("Introdusca Peso: ");
                              u = reader.nextInt();
                              HeMe.setPeso(u);
                              System.out.print("Introdusca Tamano: ");
                              l = reader.next();
                              HeMe.setTamaño(l);
                              System.out.print("Introdusca Dimensiones\n");
                              System.out.print("Introdusca valor 1: ");
                              k = reader.nextInt();
                              HeMe.setDimensiones1(k);
                              System.out.print("Introdusca valor 2: ");
                              j = reader.nextInt();
                              HeMe.setDimensiones2(j);
                          break;
                          
                          case 2:
                                {
                                    while(op2){
                                        System.out.println("\nSelector de ediccion de datos de herramientas");          
                                        System.out.println("1. Marca de producto");
                                        System.out.println("2. Modelo de producto");
                                        System.out.println("3. Codigo de producto");
                                        System.out.println("4. Precio de producto");                                        
                                        System.out.println("5. Peso de producto");
                                        System.out.println("6. Tamano de producto");
                                        System.out.println("7. Dimensiones de producto");
                                        System.out.println("8. Regresar");
                                        System.out.print("\nSeleccione una opccion: ");
                                        ope2 = reader.nextInt();
        
                                        if (ope2 == 8){
                                                System.out.println("\nRegresando......");
                                                break;
                                        } else {
                                                switch(ope2){
                                                    case 1:
                                                        System.out.print("\nIntrodusca nueva Marca: ");
                                                        n = reader.next();
                                                        He.setMarca(n); 
                                                    break;
                                                                                                        
                                                    case 2:
                                                        System.out.print("\nIntrodusca nuevo Modelo: ");
                                                        f = reader.next();
                                                        He.setModelo(f);
                                                    break;
                                                                                                        
                                                    case 3:
                                                        System.out.print("\nIntrodusca nuevo Codigo: ");
                                                        t = reader.nextInt();
                                                        He.setCódigo(t);  
                                                    break;
                                                                                                        
                                                    case 4:
                                                        System.out.print("\nIntrodusca nuevo Precio: ");
                                                        p = reader.nextInt();
                                                        He.setCosto(p);
                                                    break;
                                                    
                                                    case 5:
                                                        System.out.print("\nIntrodusca nuevo Peso: ");
                                                        u = reader.nextInt();
                                                        HeMe.setPeso(u);
                                                    break;
                                                    
                                                    case 6:
                                                        System.out.print("\nIntrodusca nuevo Tamano: ");
                                                        l = reader.next();
                                                        HeMe.setTamaño(l);
                                                    break;
                                                    
                                                    case 7:
                                                        System.out.print("\nIntrodusca nueva Dimensiones\n");
                                                        System.out.print("Introdusca valor 1: ");
                                                        k = reader.nextInt();
                                                        HeMe.setDimensiones1(k);
                                                        System.out.print("Introdusca valor 2: ");
                                                        j = reader.nextInt();
                                                        HeMe.setDimensiones2(j);
                                                    break;
                                                    
                                                    default:
                                                             System.out.printf("\nError la opccion es incorrecta");                                                          
                                            }
                                        }
                                    }
                                }
                          break;
                          
                          case 3:
                              System.out.println("\nDatos de producto");
                              System.out.println("Nombre de Marca: "+He.getMarca());
                              System.out.println("Tipo de Modelo: "+He.getModelo());
                              System.out.println("Codigo del producto: "+He.getCodigo());
                              System.out.println("Precio de producto: $"+He.getCosto());
                              System.out.println("Peso de producto: "+HeMe.getPeso()+ " Kg");
                              System.out.println("Tamano de producto: "+HeMe.getTamaño()+" m");
                              System.out.println("Dimensiones de producto: "+HeMe.getDimensiones1()+" x "+HeMe.getDimensiones2());
                          break;

                          default:
                                   System.out.printf("\nError la opccion es incorrecta");                                               
                }                                   
            }  
        }
    }
}
