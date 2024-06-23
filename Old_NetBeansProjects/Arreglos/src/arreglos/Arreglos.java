package arreglos;

import java.util.Scanner;

public class Arreglos {
       
static int opc = 0;
    static int opt = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 1;
        int i = 0;
        Dispositivos[] dispositivo = new Dispositivos[20];

        for (int k = 0; k <= 19; k++) {
            dispositivo[k] = new Dispositivos();
        }

        do {
            System.out.println("\tBienvenido al menú para registrar un Dispositivo\n");
            System.out.println("Favor de elegir una opcion:");
            System.out.println("1.- Registrar dispositivo");
            System.out.println("2.- Buscar Dispositivo");
            System.out.println("3.- Consultar Dispositivo");
            System.out.println("4.- Salir");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    Scanner datos = new Scanner(System.in);
                    datos.useDelimiter("\n");
                    count = i + 1;
                    if (i > 19) {
                        System.out.println("No se pueden registrar más dispositivos\n");
                        break;
                    } else {
                        System.out.println("Introduzca el ID del dispositivo: ");
                        dispositivo[i].setId(datos.nextInt());
                        datos.nextLine();
                        System.out.println("Introduzca el nombre del dispositivo: ");
                        dispositivo[i].setNombre(datos.nextLine());
                        System.out.println("Introduzca la versión del dispositivo: ");
                        dispositivo[i].setVersion(datos.nextLine());
                        System.out.println("Introduzca el color del dispositivo: ");
                        dispositivo[i].setColor(datos.nextLine());
                        System.out.println("REGISTRADO CORRECTAMENTE (DISPOSITIVO " + count + ")" + "\n");
                        i++;
                        break;
                    }
                case 2:
                    Scanner actualizarDatos = new Scanner(System.in);
                    actualizarDatos.useDelimiter("\n");
                    int buscador;
                    int encontrado = 0;
                    System.out.println("Introduzca el ID del dispositivo a buscar: ");
                    buscador = input.nextInt();
                    input.nextLine();
                    for (int j = 0; j <= 19; j++) {
                        count = j + 1;
                        dispositivo[j].getId();
                        if (buscador == dispositivo[j].getId()) {
                            do {
                                encontrado++;
                                System.out.println("\tSe ha encontrado el dispositivo (Dispositivo " + count + ".)");
                                System.out.println("¿Qué datos se van a modificar?");
                                System.out.println("1.- Nombre del dispositivo");
                                System.out.println("2.- Version del dispositivo");
                                System.out.println("3.- Color del dispositivo");
                                System.out.println("4.- Salir del buscador");
                                opt = input.nextInt();
                                switch (opt) {
                                    case 1:
                                        System.out.println("El nombre actual es: " + dispositivo[j].getNombre());
                                        System.out.println("Introduzca el nuevo nombre: ");
                                        dispositivo[j].setNombre(actualizarDatos.nextLine());
                                        break;
                                    case 2:
                                        System.out.println("La version actual es: " + dispositivo[j].getVersion());
                                        System.out.println("Introduzca la nueva version: ");
                                        dispositivo[j].setVersion(actualizarDatos.nextLine());
                                        break;
                                    case 3:
                                        System.out.println("El color actual es: " + dispositivo[j].getColor());
                                        System.out.println("Introduzca el nuevo color: ");
                                        dispositivo[j].setColor(actualizarDatos.nextLine());
                                        break;
                                    case 4:
                                        System.out.println("\nRegresando al menú principal.\n");
                                        break;
                                    default:
                                        System.out.println("Opcion no encontrada.\n");
                                }
                            } while (opt != 4);
                            break;
                        }
                    }
                    if (encontrado == 0) 
                        System.out.println("No se ha encontrado un dispositivo.\n");
                    
                    break;
                case 3:
                    for (int j = 0; j <= 19; j++) {
                        count = j + 1;
                        System.out.println("\tDispositivo: " + count);
                        System.out.println("ID: " + dispositivo[j].getId());
                        System.out.println("Nombre: " + dispositivo[j].getNombre());
                        System.out.println("Versión: " + dispositivo[j].getVersion());
                        System.out.println("Color: " + dispositivo[j].getColor() + "\n");
                    }
                    break;
                case 4:
                    System.out.println("\nHa salido correctamente.\n");
                    break;
                default:
                    System.out.println("Opcion no encontrada.\n");
            }

        } while (opc != 4);

    }
}


    
