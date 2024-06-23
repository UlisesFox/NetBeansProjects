package Taller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

        private static int secreto;
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(". . . ?");
        System.out.print(": ");
        secreto = reader.nextInt();
        if(secreto == 430){
            System.out.println("Una navidad con Doky!");
	SantaClausS santas = new SantaClausS();
	santas.start();

        for(int i = 1; i <= 10; i++){
            ElfoS elfos = new ElfoS(santas, i);
	    elfos.start();
	}

        ArrayList<String> NombresRenos = new ArrayList<String>(
                Arrays.asList("Relampago","Trueno ","Cupido","Cometa","Bromista",
                        "Saltarin","Danzarin","Brioso","Rodolfo"));
                
	for(int i = 1; i <= 9; i++){
            RenoS renos = new RenoS(santas,NombresRenos.get(i-1));
	    renos.start();
            }
        }else{
	SantaClaus santa = new SantaClaus();
	santa.start();

        for(int i = 1; i <= 10; i++){
            Elfo elfo = new Elfo(santa, i);
	    elfo.start();
	}

        ArrayList<String> NombresRenos = new ArrayList<String>(
                Arrays.asList("Relampago","Trueno ","Cupido","Cometa","Bromista",
                        "Saltarin","Danzarin","Brioso","Rodolfo"));
                
	for(int i = 1; i <= 9; i++){
            Reno reno = new Reno(santa,NombresRenos.get(i-1));
	    reno.start();
            }
        }
    }    
}