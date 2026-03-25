import java.util.Random;

public class EjecutarGalatic {
    public static void main(String[] args) {
        int[] energiaContenedores = new int[12];
        int min = 50;
        int max = 150;

        int longitudPrimos = 0;

        Random r = new Random();

        for (int i = 0; i < energiaContenedores.length; i++) {
            energiaContenedores[i] = r.nextInt(max - min + 1) + min;
            if (energiaContenedores[i] % 10 == 0) {
                longitudPrimos++; // Aumentar para usar esta longitud como longitud del array
            }
        }

        int[] primosObtenidos = new int[longitudPrimos];

        int llenos = 0;
        for (int i = 0; i < energiaContenedores.length; i++) {
            if (energiaContenedores[i] % 10 == 0) {
                primosObtenidos[llenos] = energiaContenedores[i];
                llenos++; // Aumentar solo si la condición es verdadera para no depender de i que puede
                          // ser mayor
            }
        }

        int[][] mapaCarga = new int[3][3];
        int contador = 0; // Contador para poder pasar de matriz a arreglo

        for (int i = 0; i < mapaCarga.length; i++) {
            for (int j = 0; j < mapaCarga[i].length; j++) {
                try {
                    mapaCarga[i][j] = primosObtenidos[contador];
                } catch (Exception ArrayIndexOutOfBoundsException) {
                    mapaCarga[i][j] = -1;
                }
                contador++; // Aumentar el contador incluso si hubo error para probar correctamente el
                            // siguiente valor
            }
        }

        int contadorDos = 0; // Contador nuevo para pasar nuevamente de matriz a arreglo
        Suministro[] manifiesto = new Suministro[9];
        for (int i = 0; i < mapaCarga.length; i++) {
            for (int j = 0; j < mapaCarga[i].length; j++) {
                if (mapaCarga[i][j] != -1) {
                    String prioridad;
                    if (mapaCarga[i][j] > 100) {
                        prioridad = "ALTA";
                    } else {
                        prioridad = "ESTANDAR";
                    }
                    manifiesto[contadorDos] = new Suministro("C" + "-" + i + "-" + j, mapaCarga[i][j], prioridad);
                } else {
                    manifiesto[contadorDos] = null; // Llenar con null si es -1
                }
                contadorDos++; // Aumentar siempre el contador
            }
        }

        // Mostrar los valores generados
        System.out.println("Energía contenedores generados por Random");
        for (int i = 0; i < energiaContenedores.length; i++) {
            System.out.print(energiaContenedores[i] + " | ");
        }
        System.out.println();

        System.out.println("Primos obtenidos por el programa");
        for (int i = 0; i < primosObtenidos.length; i++) {
            System.out.print(primosObtenidos[i] + " | ");
        }
        System.out.println();

        System.out.println("Mapa carga");
        for (int i = 0; i < mapaCarga.length; i++) {
            for (int j = 0; j < mapaCarga[i].length; j++) {
                System.out.print(mapaCarga[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Manifiesto");
        for (int i = 0; i < manifiesto.length; i++) {
            System.out.print(manifiesto[i] + " | ");
        }
        System.out.println();
    }
}
