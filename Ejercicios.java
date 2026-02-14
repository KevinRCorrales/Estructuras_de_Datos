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
        int[] numerosJuntos = {3, 5, 6, 11, 4, 2, 1, 9, 17, 12};

        // Contar los pares e impares y reservar en memoria los arreglos con esas cantidades
        int cantidadPares = 0;
        int cantidadImpares = 0;
        for (int i=0; i<numerosJuntos.length; i++) {
            if (numerosJuntos[i] % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }
        int[] pares = new int[cantidadPares];
        int[] impares = new int[cantidadImpares];

        int paresContados = 0;
        int imparesContados = 0;

        for (int i=0; i<numerosJuntos.length; i++) {
            if (numerosJuntos[i] % 2 == 0) {
                pares[paresContados] = numerosJuntos[i];
                paresContados++;
            } else {
                impares[imparesContados] = numerosJuntos[i];
                imparesContados++;
            }
        }

        System.out.println("Pares");
        for (int i=0; i<pares.length; i++) {
            System.out.print(pares[i] + " | ");
        }

        System.out.println("\nImpares");
        for (int i=0; i<impares.length; i++) {
            System.out.print(impares[i] + " | ");
        }

        System.out.println("\n\nEJERCICIO 9\n");
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
        /*
        Dado un arreglo A de N elementos se desea crear otro arreglo, tal que cada uno de sus
elementos sea la suma de los opuestos en el arreglo dado.
Ejemplo:       Arreglo dado A = (8,5,3,10,2,8,1)
               Arreglo resultante B=(9,13,5,10)
         */

        int[] arreloA = {8,5,3,10,2,8,1};
        int[] sumaOpuestos = new int[4];
        int cuenta = arreloA.length;

        for (int i=0; i<sumaOpuestos.length; i++) {
            int posicion = cuenta - 1 - i;
            if (i != posicion) { // No sumar si la posición es la misma a sumar
                sumaOpuestos[i] = arreloA[i] + arreloA[posicion];
            } else {
                sumaOpuestos[i] = arreloA[i];
            }
        }

        for  (int i=0; i<sumaOpuestos.length; i++) {
            System.out.print(sumaOpuestos[i] + " | ");
        }
        System.out.println();

        System.out.println("\nEJERCICIO 11\n");
        /*
         Dado un arreglo A de N elementos se desea generar tres arreglos que contengan los
elementos negativos, cero y positivos de arreglo inicial.
        */
        int[] elementos = {5, 0, 2, 4, 0, 5, 3, 4, 1, 1, 0, 6, 5, 9, 11, 8};
        int paresCantidad = 0;
        int cerosCantidad = 0;
        int imparesCantidad = 0;

        // Consultar la cantidad de pares, impares y ceros para reservar la memoria de los arreglos
        for (int i=0; i<elementos.length; i++) {
            if (elementos[i] == 0){
                cerosCantidad++;
            } else if (elementos[i] % 2 == 0) {
                paresCantidad++;
            } else {
                imparesCantidad++;
            }
        }

        // Declarar arreglos con las cantidades sumadas
        int[] paresArreglo = new int[paresCantidad];
        int[] imparesArreglo = new int[imparesCantidad];
        int[] cerosArreglo =  new int[cerosCantidad];

        int ceroContados = 0;
        int parContados = 0;
        int imparContados = 0;

        for (int i=0; i< elementos.length; i++) {
            if (elementos[i] == 0){
                cerosArreglo[ceroContados] = elementos[i];
                ceroContados++;
            } else if (elementos[i] % 2 == 0) {
                paresArreglo[parContados] = elementos[i];
                parContados++;
            } else {
                imparesArreglo[imparContados] = elementos[i];
                imparContados++;
            }
        }

        // Recorrer los arreglos
        for (int i = 0; i< cerosArreglo.length; i++) {
            System.out.print(cerosArreglo[i] + " | ");
        }
        System.out.println();
        for (int i = 0; i< paresArreglo.length; i++) {
            System.out.print(paresArreglo[i] + " | ");
        }
        System.out.println();
        for (int i = 0; i< imparesArreglo.length; i++) {
            System.out.print(imparesArreglo[i] + " | ");
        }
        System.out.println();
        System.out.println("\nEJERCICIO 12\n");
        /*
         Dado un arreglo A de N elementos se quiere generar otro arreglo que contenga las
posiciones de los elementos del arreglo dado que sean iguales a un valor x dado.
Ejemplo:  Arreglo dado A=(4,6,8,2,6,9,6,1)
          X=6
          Arreglo resultante B=(2,5,7)
         */

        int[] arregloA = {4,6,8,2,6,9,6,1};
        int x = 6;

        int encontrados = 0;

        for (int i=0; i<arregloA.length; i++) {
            if (arregloA[i] == x) {
                encontrados++;
            }
        }

        int[] iguales = new int[encontrados];
        int posicionSiguiente = 0;

        for (int i=0; i<arregloA.length; i++) {
            if (arregloA[i] == x) {
                iguales[posicionSiguiente] = i + 1; // Aumentar en 1, ya que la posición se desea guardar comenzando desde el 1
                posicionSiguiente++;
            }
        }

        for (int i=0; i<iguales.length; i++) {
            System.out.print(iguales[i] + " | ");
        }
        System.out.println();

        System.out.println("\nEJERCICIO 13\n");
        /*
        Dado  un  arreglo  A  de  N  elementos  se  desea  almacenar  los  elementos  mayores  y
menores que la media, almacenarlos en vectores diferentes.
         */
        int[] elementosA = {23, 43, 12, 8, 65, 4, 3, 65, 45, 87, 23, 9};

        // Hallar la media
        int totalElementos = 0;
        for (int i=0; i<elementosA.length; i++) {
            totalElementos += elementosA[i];
        }

        float media = (float) totalElementos / elementosA.length;
        System.out.println("La media es: " + media);

        // Encontrar cantidad de mayores y menores
        int cantidadMayores = 0;
        int cantidadMenores = 0;
        for (int i=0; i<elementosA.length; i++) {
            if (elementosA[i] > media) {
                cantidadMayores++;
            } else {
                cantidadMenores++;
            }
        }

        // Iniciar los arreglos con las cantidades obtenidas
        int[] mayores = new int[cantidadMayores];
        int[] menores = new int[cantidadMenores];

        int siguienteMayor = 0;
        int siguienteMenor = 0;

        for (int i=0; i<elementosA.length; i++) {
            if (elementosA[i] > media) {
                mayores[siguienteMayor] = elementosA[i];
                siguienteMayor++;
            } else {
                menores[siguienteMenor] = elementosA[i];
                siguienteMenor++;
            }
        }

        System.out.println("\nMayores:");
        for (int i=0; i<mayores.length; i++) {
            System.out.print(mayores[i] + " | ");
        }

        System.out.println("\nMenores:");
        for (int i=0; i<menores.length; i++) {
            System.out.print(menores[i] + " | ");
        }
        System.out.println();

        System.out.println("\nEJERCICIO 14\n");
        /*
        Dado un arreglo de N elementos se desea obtener otro arreglo tal que sus elementos
sean la diferencia de los elementos sucesivos del arreglo dado.
Ejemplo:  Arreglo dado A=(4,6,8,2,6,9,5,1)
    Arreglo resultante B=(-2,-2,6,-4,-3,4,4)
         */
        int[] arregloElementos = {4,6,8,2,6,9,5,1};
        int[] restas = new int[arregloElementos.length - 1];

        for (int i=0; i<restas.length; i++) {
            restas[i] = arregloElementos[i] - arregloElementos[i+1];
        }

        for (int i=0; i<restas.length; i++) {
            System.out.print(restas[i] + " | ");
        }
        System.out.println();

        System.out.println("\nEJERCICIO 15\n");
        /*
         Se  tienen  los  nombres  y  los  sueldos  de  los  trabajadores  de  una  empresa.  Se  desea
saber cuántos y quiénes tienen un sueldo promedio.
         */
        String[] empleadosArreglo = {"Felipe", "Karol", "Sandra", "Manuel", "Andres", "Emilio", "Ana"};
        int[] salarios = {100, 500, 450, 300, 200, 250, 300};
        int promedio = 0;
        for (int i=0; i<salarios.length; i++) {
            promedio += salarios[i];
        }
        promedio = promedio / salarios.length;
        System.out.println("El promedio de salarios es: " + promedio);
        int empleadosPromedio = 0;

        for (int i=0; i<empleadosArreglo.length; i++) {
            if (salarios[i] == promedio) {
                System.out.println("El empleado/a " + empleadosArreglo[i] + " tiene un salario promedio.");
                empleadosPromedio++;
            }
        }

        System.out.println(empleadosPromedio + " empleados tienen un salario promedio.");
    }
}
