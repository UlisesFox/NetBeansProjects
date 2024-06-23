package com.ceti;

import java.util.Scanner;

public class Operacion {

    private double mB, gB;
    private double bytes;
    private long bits;
    private double resultado;
    Scanner entrada = new Scanner(System.in);

    public void mB() {
        long n = 1;
        int cables = 0;
        double elevar;
        System.out.println("Ingrese la memoria a direccionar (en MB): ");
        mB = entrada.nextDouble();
        System.out.println("Ingrese los bits que se van a introducir: ");
        bits = 0;
        elevar = Math.pow(10, 6);
        bits = entrada.nextInt();
        bytes = bits / 8;
        resultado = (mB * elevar) / bytes;
        System.out.println("El resultado es: " + resultado);
        for (int i = 0; i <= resultado; i++) {
            n *= 2; // n = n*2;
            cables += 1; // k = k+1;
            System.out.println("n vale" + "(" + cables + "):" + n);

            if (n >= resultado) {
                System.out.println("Se necesitan: " + cables + " cables\n");
                break;
            }
        }
    }

    public void gB() {
        long n =1;
        int cables = 0;
        double elevar;
        System.out.println("Ingrese la memoria a direccionar (en GB): ");
        gB = entrada.nextDouble();
        System.out.println("Ingrese los bits que se van a introducir: ");
        bits = 0;
        elevar = Math.pow(10, 9);
        bits = entrada.nextInt();
        bytes = bits / 8;
        resultado = (gB * elevar) / bytes;
        System.out.println("El resultado es: " + resultado);
        for (int i = 0; i <= resultado; i++) {

            n *= 2;
            cables += 1;
            System.out.println("n vale" + "(" + cables + "): " + n);
            if (n >= resultado) {
                System.out.println("Se necesitan: " + cables + " cables\n");
                break;
            }
        }
    }
}
