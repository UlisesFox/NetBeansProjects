package Programa;

import java.util.Scanner;

public class programa {

    private double MegaBytes;
    private long Bytes;
    private long Bits;
    private double Resu;
    private long N = 1;
    private int D = 0;
    double Elevado;
    Scanner entrada = new Scanner(System.in);

        public void conversion() {
        
            System.out.println("Bienvenidos al conversor\n");
            System.out.println("Favor de ingresar cantidad de MB: ");
            MegaBytes = entrada.nextDouble();
            System.out.println("Favor de ingrese cantidad de Bits: ");
            Bits = 0;
            Elevado = Math.pow(10, 6);
            Bits = entrada.nextInt();

                Bytes = Bits / 8;
                Resu = (MegaBytes * Elevado) / Bytes;
                    System.out.println("Resultado: " + Resu + "\n");

                        for (int i = 0; i<=Resu; i++) {
                        N *= 2;
                        D += 1;

                            System.out.println("El valor de N vale: "+ N);
            
            if (N >= Resu) {

                System.out.println("\nSe necesitan un total de " + D + " cables\n");
                System.out.println("Resultados y Datos ingresados");
                System.out.println("MB: " + MegaBytes);     
                System.out.println("Bytes: " + Bytes);
                System.out.println("Resultado: " + Resu);
                System.out.println("Cables totales: " + D + "\n");
                System.out.println("Fin del programa\n");

                break;
            }
        }
    }
}
