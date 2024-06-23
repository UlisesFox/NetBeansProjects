package VectorColision;

import java.util.Scanner;

public class MainColi {

static int opc;
static long vec;
static long bus;
static long resu;
static long sum;
static long movi;

    static Scanner entre = new Scanner (System.in);
    static Scanner input = new Scanner (System.in); 

    public static void main(String[] args) {
        
    vec = 1000;
    System.out.println("Vector a utilizar es igual a " + vec);
    System.out.println("");

            {
            for (int s = 1; s <= 3; s++) {
            resu = s + 1;}
            resu = vec / 4;
            sum = resu + 1;
            if (resu == 1){
            resu =-1;}

            for (int j = 3; j <= 2; j++) {
            resu = j + 1;
            System.out.println("\ntiene: ");}

            }

        {
        for (int o = 1; o <= 2; o++) {
        movi = o + 1;
        resu = vec + movi;}
        if(vec == 1){
        sum =- 1;
        } else {

        resu = vec - movi;
        for (int o = 2; o <= 1; o++) {
        movi = o + 1;
        resu = vec + movi;}

        }
        }

        CodigoColi Maincolin = new CodigoColi();
        Maincolin.Codigo();

        System.out.println("Fin del programa");

            }
        }