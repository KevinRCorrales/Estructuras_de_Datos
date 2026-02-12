import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        // EJERCICIO 1 EN EL ARCHIVO Main.java
        System.out.println("EJERCICIO 2\n");
        /*
         Se tienen N empleados de una compañía y se ha ideado llenar un arreglo lineal A con 
sueldos de los empleados, un arreglo B con las asignaciones totales de cada empleado, 
un arreglo C con las deducciones de cada uno. Crear un arreglo T que contenga el neto 
a pagar a cada empleado. (Neto a pagar= sueldo + asignaciones - deducciones) 
        */
        String[] empleados = {"Felipe", "Karol", "Sandra", "Manuel", "Andres", "Emilio"};
        int[] sueldos = {2200000, 3000000, 2500000, 4100000, 2900000, 4000000};
        int[] asignaciones = {200000, 250000, 220000, 300000, 290000, 295000};
        int[] deducciones = {100000, 140000, 125000, 160000, 155000, 135000};

        int[] pagoTotal = new int[empleados.length];

        for (int i=0; i<empleados.length; i++) {
            pagoTotal[i] = sueldos[i] + asignaciones[i] - deducciones[i];
        }

        for (int i=0; i< empleados.length; i++) {
            System.out.println("Al empleado " + empleados[i] + " le corresponde un pago total de " + pagoTotal[i]);
        }

        System.out.println("\nEJERCICIO 3\n");
        /*
         Dado  un  arreglo  lineal  de  números,  sumar  separadamente  los  números  pares  y  los 
números impares.
        */
        int[] numeros = { 2, 6, 8, 1, 20, 40, 7, 3, 5 };
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            // Suma de pares e impares
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }
        }

        System.out.println("La suma de los elementos pares es: " + sumaPares);
        System.out.println("La suma de los elementos impares es: " + sumaImpares);

        System.out.println("\nEJERCICIO 4\n");
        /*
         Se tienen dos arreglos unidimensionales que guardan las edades de un grupo de
personas, se pide hallar el mayor valor.
         */
        int[] edadesGrupo1 = {34, 32, 12, 6, 51, 45, 15, 17, 16};
        int[] edadesGrupo2 = {65, 52, 51, 70, 5, 10, 69, 20, 11};

        int mayor = edadesGrupo1[0]; // iniciar variable

        // Recorrer primero el grupo 1
        for (int i=0; i<edadesGrupo1.length; i++) {
            if (edadesGrupo1[i] >= mayor) {
                mayor = edadesGrupo1[i];
            }
        }

        // Recorrer luego el grupo 2
        for (int i=0; i<edadesGrupo2.length; i++) {
            if (edadesGrupo2[i] >= mayor) {
                mayor = edadesGrupo2[i];
            }
        }

        System.out.println("La edad mayor es: " + mayor);

        System.out.println("\nEJERCICIO 5\n");
        /*
         Se  tiene  tres  arreglos  unidimensionales  que  guardan  los  precios  unitarios  (PU)  las
cantidades compradas (CC) y la descripción respectivamente de N productos distintos.
Se Pide:
a.  Crear un arreglo con el total gastado en compras por producto (TG=PU*CC)
b.  Calcular el total general de todas las compras.
c.  Mostrar la descripción y el total del producto que obtuvo mayor gasto.
         */

        int[] preciosUnitarios = {10000, 50000, 7000, 56000, 34000};
        int[] cantidadesCompradas = {5, 3, 7, 4, 8};
        String[] descripciones = {
                "Producto 1038iwjsm3", "Producto 10i9edxjd", "Producto 2i0jqwjtgf", "Producto s3ihnx3nr9", "Producto 2eioc3hnrun"
        };
        int[] totalGastado = new int[preciosUnitarios.length];
        int total = 0;
        int mayorTotal = 0;
        String mayorTotalDescripcion = "";

        for (int i=0; i< preciosUnitarios.length; i++) {
            int totalProducto = preciosUnitarios[i] * cantidadesCompradas[i];
            totalGastado[i] = totalProducto;
        }

        for (int i=0; i<totalGastado.length; i++) {
            total += totalGastado[i];
            if (totalGastado[i] > mayorTotal) {
                mayorTotal = totalGastado[i];
                mayorTotalDescripcion = descripciones[i];
            }
        }

        System.out.println("Total general de todas las compras: " + total);
        System.out.println("Producto con mayor gasto: " + mayorTotalDescripcion + " con total gastado de: " + mayorTotal);

        System.out.println("\nEJERCICIO 6\n");
        /*
         Una agencia administradora de inmuebles ha decidido guardar en un arreglo lineal de
n posiciones los alquileres que cobran mensualmente a N viviendas que actualmente
administran. En otro arreglo de igual número de posiciones guardan los porcentajes de
ganancia  por  cada  vivienda.  Crear  un  nuevo  arreglo  con  las  ganancias  por  cada
vivienda.
         */
        int[] valoresAlquiler = {700000, 800000, 600000, 1000000, 755000};
        int[] porcentajeGanancia = {29, 50, 45, 30, 60};

        int[] ganancias = new int[valoresAlquiler.length];

        for (int i=0; i<valoresAlquiler.length; i++) {
            ganancias[i] = valoresAlquiler[i] * porcentajeGanancia[i] / 100;
        }

        for (int i=0; i<valoresAlquiler.length; i++) {
            System.out.println("Ganancia por vivienda " + i + ": " + ganancias[i]);
        }

        System.out.println("\nEJERCICIO 7\n");
        /*
         Obtener  dos  arreglos  tal  que  sus  elementos  sean  los  números  pares  y  números
impares del arreglo A de 10 elementos.
         */
        // AUN NO REALIZADO








        System.out.println("\nEJERCICIO 8\n");
        // PROGRAMA COMENTADO DEBIDO A QUE SE SOLICITAN DEMASIADOS DATOS
        // DESCOMENTAR APENAS SE TERMINEN Y PRUEBEN LOS DEMAS EJERCICIOS
        /*
         Elaborar un programa que lea 30 números y que imprima el número mayor, menor y el
número de veces que se repiten ambos.

        Scanner scan = new Scanner(System.in);
        int[] numerosLeidos = new int[30];
        for (int i=0; i<30; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numerosLeidos[i] = scan.nextInt();
        }


        Crear las variables una vez el arreglo ya contenga los datos leídos por consola
        evitando que todas las variables se inicien por defecto en 0

        int mayorLeido = numerosLeidos[0];
        int menorLeido = numerosLeidos[0];
        int menorRepeticiones = 0;
        int mayorRepeticiones = 0;

        for (int i=0; i<30; i++) {
            if (numerosLeidos[i] >= mayorLeido) {
                mayorLeido = numerosLeidos[i];
            }
            if (numerosLeidos[i] <= menorLeido) {
                menorLeido = numerosLeidos[i];
            }
        }

        for (int i=0; i<30; i++) {
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
        */

        System.out.println("\nEJERCICIO 9\n");
        /*
         Codifique  un  programa  tal,  que  dado  como  entrada  un  arreglo  unidimensional  de
enteros  y  un  número  entero,  determine  cuántas  veces  se  encuentra  este  número
dentro del arreglo.
         */

        int[] numerosDados = {34, 97, 2, 76, 34, 54, 2, 54, 65, 98, 34, 98, 34, 98, 1, 98, 2, 87, 9, 45, 9, 97};
        int numeroBuscado = 98;
        int contador = 0;

        for  (int i=0; i<numerosDados.length; i++) {
            if (numerosDados[i] == numeroBuscado) {
                contador++;
            }
        }

        System.out.println("El número " + numeroBuscado + " se repite " + contador + " veces en el arreglo.");

        System.out.println("\nEJERCICIO 10\n");
        // AUN NO REALIZADO
    }
}
