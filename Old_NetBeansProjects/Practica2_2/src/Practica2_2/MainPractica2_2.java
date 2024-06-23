package Practica2_2;

import java.util.Scanner;

public class MainPractica2_2 {

static int Option = 0;
    static int Opccion = 0;
        static int Opssion = 0;
            static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int contar;
            int A = 0;
                Medi[] medicina = new Medi[20];

        for (int m = 0; m <= 19; m++) {
            medicina[m] = new Medi();

        }

        do {

            System.out.println("Menú para el registro de Medicinas\n");
            System.out.println("Favor de elegir una opcion valida");
            System.out.println("1.- Registro de Medicina");
            System.out.println("2.- Modificar un Medicina");
            System.out.println("3.- Ver listado de Medicina");
            System.out.println("4.- Borrar listadio de Medicina");
            System.out.println("5.- Salir");
            Option = input.nextInt();

            switch (Option) {

                case 1:
                    Scanner datos = new Scanner(System.in);
                    datos.useDelimiter("\n");
                    contar = A + 1;

                    if (A > 19) {

                        System.out.println("No se pueden registrar más Medicina\n");
                        break;

                    } else {

                        System.out.println("Introduzca el codigo de la Medicina: ");
                        medicina[A].setCodigo(datos.nextInt());
                        datos.nextLine();
                        System.out.println("Introduzca el nombre del Medicina: ");
                        medicina[A].setNombre(datos.nextLine());
                        System.out.println("Introduzca la precio de la Medicina: ");
                        medicina[A].setPrecio(datos.nextLine());
                        System.out.println("Sea registrado correctamente (Medicina " + contar + ")" + "\n");
                        A++;

                        break;
                    }

                case 2:

                    Scanner actua = new Scanner(System.in);
                    actua.useDelimiter("\n");
                        int buscar;
                        int encontrar = 0;
                            System.out.println("Introduzca el codigo de la Medicina: ");
                            buscar = input.nextInt();
                            input.nextLine();

                    for (int j = 0; j <= 19; j++) {
                            contar = j + 1;
                                medicina[j].getCodigo();

                        if (buscar == medicina[j].getCodigo()) {
                            do {

                                encontrar++;
                                    System.out.println("Se encontro la Medicina (Medicina " + contar + ".)");
                                    System.out.println("Datos a modificara");
                                    System.out.println("1.- Nombre de la Medicina");
                                    System.out.println("2.- precio de la Medicina");
                                    System.out.println("3.- Salir del buscador");
                                    Opccion = input.nextInt();

                                switch (Opccion) {

                                    case 1:

                                        System.out.println("Nombre actual es: " + medicina[j].getNombre());
                                        System.out.println("Introduzca nuevo nombre: ");
                                        medicina[j].setNombre(actua.nextLine());

                                        break;

                                    case 2:

                                        System.out.println("Version actual es: " + medicina[j].getPrecio());
                                        System.out.println("Introduzca nueva version: ");
                                        medicina[j].setPrecio(actua.nextLine());

                                        break;

                                    case 3:

                                        System.out.println("\nRegresando...\n");

                                        break;

                                    default:

                                        System.out.println("Opcion no valida.\n");
                                }

                            } while (Opccion != 3);
                            break;
                        }

                    }

                    if (encontrar == 0) 
                        System.out.println("Error medicina no valido.\n");
                    
                    break;

                case 3:

                    for (int n = 0; n <= 19; n++) {

                        contar = n + 1;
                        System.out.println("Medicina: " + contar);
                        System.out.println("Codigo: " + medicina[n].getCodigo());
                        System.out.println("Nombre: " + medicina[n].getNombre());
                        System.out.println("Precio: " + medicina[n].getPrecio() + "\n");

                    }

                    break;

                case 4:

                    {

                    System.out.println("Seguro que desea eliminar toda la tabla");
                    System.out.println("(Favor de contestar con numero)");
                    System.out.println("1.- SI");
                    System.out.println("2.- NO");
                    Opssion = input.nextInt();
                        
                        switch (Opssion) {

                            case 1:

                                System.out.println("\nEliminando...\n");
                                MainPractica2_2.main (null);

                            break;

                            case 2:

                                System.out.println("\nCancelando...\n");

                            break;
                            
                            default:

                                System.out.println("\nError.\n");

                        }

                    }

                    break;

                case 5:

                    System.out.println("\nSaliendo...\n");

                    break;

                default:

                    System.out.println("Opcion no encontrada.\n");

            }

        } while (Option != 5);

    }

}