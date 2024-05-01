//Moisés Isaías Méndez Sánchez
// 2024-1687U
// 1M7-s

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("No puede ingresar palabras, Por favor intente nuevamente.");
                System.out.println("----------------------------------------------------------------------------------------------\n");
                leer.nextLine();
            }

        } while (condiciosalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("---------------------------------------------------------------------------------------------- \n");
        System.out.println("Mostrando los datos en orden normal.");

        Mostrar(array);
        Mostrar_inv(array);

    }

    public static int[] llenado() { //retorna los valores para el arreglo.

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valor "+ (i + 1));
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {   //Recibe como parametros los valores del arreglo para mostrarlos.

        for (int i : a) {
            System.out.println(i);
            

        }

        System.out.println("---------------------------------------------------------------------------------------------- \n");
    }

    public static void Mostrar_inv(int[] a) {

        System.out.println("Mostrando los datos en orden inverso.");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
 
}
