package arreglosdeobjetos;

import java.util.Scanner;

public class mainListas {

    public static void main(String[] args) {

        int opc=0, numero;
        Scanner leer = new Scanner(System.in);

        ListaEnlasada lista = new ListaEnlasada();

        do{

            System.out.println("Menu Lista Enlazada Simple");
            System.out.println("1. Agregar");
            System.out.println("2. Recorrer");
            System.out.println("3. Buscar Valor");
            System.out.println("4. Eliminar valor");
            System.out.println("0. Fin");
            System.out.println("Elige una opcion: ");
opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("ingresa un numero: ");
                    numero = leer.nextInt();
                    lista.agregar(numero);
                    break;

                case 2:
                    lista.recorrerLista();
                    break;

                case 3:
                    System.out.println("Numero a Buscar: ");
                    numero = leer.nextInt();
                    lista.buscarValor(numero);
                    break;

                case 4:
                    System.out.println("Numero a Eliminar: ");
                    numero = leer.nextInt();
                    lista.borrarNodo(numero);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Error");
                    break;
            }

        }while(opc != 0);

    }
    
}
