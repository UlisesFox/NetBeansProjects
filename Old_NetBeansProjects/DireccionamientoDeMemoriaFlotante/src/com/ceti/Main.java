package com.ceti;

import java.util.Scanner;

public class Main {

    static int opc = 0;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Operacion datos = new Operacion();

        do {
            System.out.println("BENJAMÍN CORTINA RENTERÍA 21110150 22/02/2022");
            System.out.println("\tMENÚ\n");
            System.out.println("1.- Introducir Direccionamiento en MB");
            System.out.println("2.- Introducir Direccionamiento en GB");
            System.out.println("9.- Salir");
            opc = lector.nextInt();

            switch (opc) {
                case 1:
                    datos.mB();
                    break;
                case 2:
                    datos.gB();
                    break;
                case 9:
                    System.out.println("Ha salido exitosamente del programa");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }

        } while (opc != 9);
    }
}
