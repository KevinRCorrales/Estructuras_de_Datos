import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Ejercicio que usa Scanner
        System.out.println("\n\nEJERCICIO 8\n");
    /*
     Elaborar un programa que lea 30 números y que imprima el número mayor, menor y el
número de veces que se repiten ambos.
    */
        Scanner scan = new Scanner(System.in);
        int[] numerosLeidos = new int[30];
        for (
                int i = 0;
                i < 30; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numerosLeidos[i] = scan.nextInt();
        }


        /*Crear las variables una vez el arreglo ya contenga los datos leídos por consola
        evitando que todas las variables se inicien por defecto en 0*/

        int mayorLeido = numerosLeidos[0];
        int menorLeido = numerosLeidos[0];
        int menorRepeticiones = 0;
        int mayorRepeticiones = 0;

        for (
                int i = 0;
                i < 30; i++) {
            if (numerosLeidos[i] >= mayorLeido) {
                mayorLeido = numerosLeidos[i];
            }
            if (numerosLeidos[i] <= menorLeido) {
                menorLeido = numerosLeidos[i];
            }
        }

        for (
                int i = 0;
                i < 30; i++) {
            if (numerosLeidos[i] == mayorLeido) {
                mayorRepeticiones++;
            }
            if (numerosLeidos[i] == menorLeido) {
                menorRepeticiones++;
            }
        }

        scan.close();

        System.out.println("El número mayor es: " + mayorLeido);
        System.out.println("El número menor es: " + menorLeido);
        System.out.println("El número mayor se repite " + mayorRepeticiones + " veces");
        System.out.println("El número menor se repite " + menorRepeticiones + " veces");
    }
}
