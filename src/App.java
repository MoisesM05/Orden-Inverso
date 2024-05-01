//Moisés Isaías Méndez Sánchez
// 2024-1687U
// 1M7-s

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static int tamaño = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean continuar = true;

        do {

            try {

                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println(
                        "Ingrese el tamaño del arreglo");
                        System.out.println("Tamaño maximo 16, tamaño minimo 1.");
                tamaño = leer.nextInt();//10
                continuar = (tamaño >= 2 && tamaño <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("No puede ingresar palabras, Por favor intente nuevamente.");
                System.out.println("----------------------------------------------------------------------------------------------\n");
                leer.nextLine();
            }

        } while (continuar);


        int array[] = llenado(); //Se recibe el array del método.

        System.out.println("---------------------------------------------------------------------------------------------- \n");
        System.out.println("Mostrando los datos en orden NORMAL.");

        Mostrar(array); //Llama método para imprimir en orden normal.
        Mostrar_inv(array); //Llama método para imprimir en orden inverso.

    }

    //METODO NUMERO 1 "Llenado"
    public static int[] llenado() { //retorna los valores para el arreglo.

        boolean continuar2= true;
        int[] arreglo = new int[tamaño];

        do{
            try{    //Captura si el usuario ingresa valores que no sean de tipo Int.
                for (int i = 0; i < arreglo.length; i++) {  //Capturando datos desde el usuario.
                    System.out.print("Ingrese el valor "+ (i + 1)+": ");
                    arreglo[i] = leer.nextInt();
                }
                
            }catch(InputMismatchException inputMismatchException){  //Excepción.
                System.out.println("Por favor ingrese valores enteros.");
                System.out.println("----------------------------------------------------------------------------------------------");
                leer.nextLine();
                continue;
            }
            
            continuar2 = false; //Cierra el ciclo si el usuario ingreso los datos correctos.

        }while(continuar2);
        return arreglo;
        
    }

    //METODO NUMERO 2 "Mostrar orden normal"
    public static void Mostrar(int[] a) {   //Recibe como parametros los valores del arreglo para mostrarlos.

        for (int i : a) {
            System.out.println(i);

        }

        System.out.println("---------------------------------------------------------------------------------------------- \n");
    }

    //METODO NUMERO 3 "Mostrar en orden inverso"
    public static void Mostrar_inv(int[] a) {   //Método para imprimir los valores inverso.

        System.out.println("Mostrando los datos en orden INVERSO.");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
 
}
