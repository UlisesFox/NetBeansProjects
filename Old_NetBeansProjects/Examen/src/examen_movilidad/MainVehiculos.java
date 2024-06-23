package examen_movilidad;

import java.util.Scanner;

public class MainVehiculos {

static int Option = 0;
    static int Opccion = 0;
        static int Opssion = 0;
            static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int contar;
            int A = 0;
                vehiculos[] vehi = new vehiculos[5];

        for (int m = 0; m <= 4; m++) {
            vehi[m] = new vehiculos();

        }

        do {

            System.out.println("Menú para el registro de Vehiculos\n");
            System.out.println("Favor de elegir una opcion valida");
            System.out.println("1.- Registro de Vehiculos");
            System.out.println("2.- Buscar un Vehiculo");
            System.out.println("3.- Ver listado de Vehiculos");
            System.out.println("4.- Salir");
            Option = input.nextInt();

            switch (Option) {

                case 1:
                    Scanner datos = new Scanner(System.in);
                    datos.useDelimiter("\n");
                    contar = A + 1;

                    if (A > 4) {

                        System.out.println("No se pueden registrar más Vehiculos\n");
                        break;

                    } else {

                        System.out.println("Introduzca las placas del Veiculo: ");
                        vehi[A].setPlacas(datos.nextInt());
                        datos.nextLine();
                        System.out.println("Introduzca el modelo del Vehiculo: ");
                        vehi[A].setModelo(datos.nextInt());
                        datos.nextLine();
                        System.out.println("Introduzca el estado del Vehiculo: ");
                        vehi[A].setEstado(datos.nextLine());
                        System.out.println("Introduzca la marca del Vehiculo: ");
                        vehi[A].setMarca(datos.nextLine());
                        System.out.println("Sea registrado correctamente (Medicina " + contar + ")" + "\n");
                        A++;

                        break;
                    }

                case 2:

                    Scanner actua = new Scanner(System.in);
                    actua.useDelimiter("\n");
                        int buscar;
                        int encontrar = 0;
                            System.out.println("Introduzca las Placas del vehiculo: ");
                            buscar = input.nextInt();
                            input.nextLine();

                    for (int j = 0; j <= 4; j++) {
                            contar = j + 1;
                                vehi[j].getPlacas();

                        if (buscar == vehi[j].getPlacas()) {
                            do {

                                encontrar++;
                                    System.out.println("Se encontro el Vehiculo (Vehiculo " + contar + ".)");
                                    System.out.println("Borrar datos?");
                                    System.out.println("1.- Si");
                                    System.out.println("2.- No");
                                    Opccion = input.nextInt();

                                switch (Opccion) {

                                    case 1:

                                    System.out.println("\nEliminando...\n");

                                    break;

                                    case 2:

                                    System.out.println("\nCancelando...\n");

                                    break;

                                    default:

                                    System.out.println("\nError.\n");

                                }

                            } while (Opccion != 2);
                            break;
                        }

                    }

                    if (encontrar == 0) 
                        System.out.println("Error vehiculo no valido.\n");
                    
                    break;

                    case 3:

                    for (int n = 0; n <= 4; n++) {

                        contar = n + 1;
                        System.out.println("Vehiculo: " + contar);
                        System.out.println("Placas: " + vehi[n].getPlacas());
                        System.out.println("Modelo: " + vehi[n].getModelo());
                        System.out.println("Estado: " + vehi[n].getEstado());
                        System.out.println("Marca: " + vehi[n].getMarca() + "\n");

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