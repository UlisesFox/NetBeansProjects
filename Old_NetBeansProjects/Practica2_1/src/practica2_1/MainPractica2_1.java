package practica2_1;

import java.util.Scanner;

public class MainPractica2_1 {

static int Option = 0;
    static int Opccion = 0;
        static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int contar;
            int A = 0;
                Dispo[] dispositivo = new Dispo[20];

        for (int m = 0; m <= 19; m++) {
            dispositivo[m] = new Dispo();

        }

        do {

            System.out.println("Menú para el registro de Dispositivos\n");
            System.out.println("Favor de elegir una opcion valida");
            System.out.println("1.- Registro de dispositivo");
            System.out.println("2.- Modificar un dispositivo");
            System.out.println("3.- Ver listado de dispositivos");
            System.out.println("4.- Salir");
            Option = input.nextInt();

            switch (Option) {

                case 1:
                    Scanner datos = new Scanner(System.in);
                    datos.useDelimiter("\n");
                    contar = A + 1;

                    if (A > 19) {

                        System.out.println("No se pueden registrar más dispositivos\n");
                        break;

                    } else {

                        System.out.println("Introduzca el ID del dispositivo: ");
                        dispositivo[A].setId(datos.nextInt());
                        datos.nextLine();
                        System.out.println("Introduzca el nombre del dispositivo: ");
                        dispositivo[A].setNombre(datos.nextLine());
                        System.out.println("Introduzca la versión del dispositivo: ");
                        dispositivo[A].setVersion(datos.nextLine());
                        System.out.println("Sea registrado correctamente (Dispositivo " + contar + ")" + "\n");
                        A++;

                        break;
                    }

                case 2:

                    Scanner actua = new Scanner(System.in);
                    actua.useDelimiter("\n");
                        int buscar;
                        int encontrar = 0;
                            System.out.println("Introduzca el ID del dispositivo: ");
                            buscar = input.nextInt();
                            input.nextLine();

                    for (int j = 0; j <= 19; j++) {
                            contar = j + 1;
                                dispositivo[j].getId();

                        if (buscar == dispositivo[j].getId()) {
                            do {

                                encontrar++;
                                    System.out.println("Se encontro el dispositivo (Dispositivo " + contar + ".)");
                                    System.out.println("Datos a modificara");
                                    System.out.println("1.- Nombre del dispositivo");
                                    System.out.println("2.- Version del dispositivo");
                                    System.out.println("3.- Salir del buscador");
                                    Opccion = input.nextInt();

                                switch (Opccion) {

                                    case 1:

                                        System.out.println("Nombre actual es: " + dispositivo[j].getNombre());
                                        System.out.println("Introduzca nuevo nombre: ");
                                        dispositivo[j].setNombre(actua.nextLine());

                                        break;

                                    case 2:

                                        System.out.println("Version actual es: " + dispositivo[j].getVersion());
                                        System.out.println("Introduzca nueva version: ");
                                        dispositivo[j].setVersion(actua.nextLine());

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
                        System.out.println("Error dispositivo no valido.\n");
                    
                    break;

                case 3:

                    for (int n = 0; n <= 19; n++) {

                        contar = n + 1;
                        System.out.println("Dispositivo: " + contar);
                        System.out.println("ID: " + dispositivo[n].getId());
                        System.out.println("Nombre: " + dispositivo[n].getNombre());
                        System.out.println("Versión: " + dispositivo[n].getVersion() + "\n");

                    }

                    break;

                case 4:

                    System.out.println("\nSaliendo...\n");

                    break;

                default:

                    System.out.println("Opcion no encontrada.\n");

            }

        } while (Option != 4);

    }

}