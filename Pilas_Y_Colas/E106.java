import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class E106 {
    public static void main(String[] args) {
        int clientesAtendidos = 0;
        int sumaCola = 0;
        int tamanoMaximo = 0;
        int numCliente = 0;
        double maximoEspera = 0;
        double totalAbiertoCaja4 = 0;
        Queue<String> cola = new LinkedList<>();
        // Añadir 15 clientes a la fila
        for (int i = 0; i < 15; i++) {
            cola.add("Cliente" + i);
        }
        System.out.println("Fila al comenzar la simulación: " + cola);
        Stack<String> cajas = new Stack<>();
        cajas.add("Caja1");
        cajas.add("Caja2");
        cajas.add("Caja3");

        // Objeto Random para cuando hayan 2 o más cajas libres
        Random r = new Random();

        boolean[] cajasLibres = { true, true, true, false }; // La caja 4 aun no está atendiendo
        boolean cajas4Abierta = false;
        double[] tiempoCajas = {0,0,0,0};

        double minutos = 7 * 60; // 7 horas de simulación por 60 minutos que tiene una hora

        for (int i = 0; i < minutos; i++) {
            if (cola.size() > 20) {
                cajasLibres[3] = true; // Habilitar la cuarta caja si hay más de 20 clientes
                cajas4Abierta = true;
            } else {
                cajasLibres[3] = false;
                cajas4Abierta = false;
            }

            int libres = 0;
            for (int d = 0; d < cajasLibres.length; d++) {
                // Ver si hay varias cajas libres
                if (cajasLibres[d]) {
                    libres++;
                }
            }

            for (int p = 0; p < cajasLibres.length; p++) {
                if (libres >= 2) {
                    // La elección del cliente será aleatoria
                    int caja = r.nextInt((libres - 0 + 1)) + 0;
                    cajasLibres[caja] = false; // Ya no está libre
                    libres--;
                }
            }

            for (int e = 0; e < cajasLibres.length; e++) {
                if (cajasLibres[e]) {
                    cajasLibres[e] = false;
                }
            }

            // Verificar cada caja por individual si ya no hay más de 2 libres
            if (!cajasLibres[0]) {
                // Empezar contador de esta caja
                double ranTime = r.nextDouble(2.5 - 1.5 + 1) + 1.5;
                if (tiempoCajas[0] > ranTime) {
                    cajasLibres[0] = true;
                    clientesAtendidos++;
                    cola.remove();
                    if (ranTime > maximoEspera) {
                        maximoEspera = ranTime;
                    }
                    tiempoCajas[0] = 0;
                } else {
                    tiempoCajas[0]++;
                }
            } else if (!cajasLibres[1]) {
                double ranTime = r.nextDouble(5 - 2 + 1) + 2;
                if (tiempoCajas[1] > ranTime) {
                    cajasLibres[1] = true;
                    clientesAtendidos++;
                    cola.remove();
                    if (ranTime > maximoEspera) {
                        maximoEspera = ranTime;
                    }
                    tiempoCajas[1] = 0;
                } else {
                    tiempoCajas[1]++;
                }
            } else if (!cajasLibres[2]) {
                double ranTime = r.nextDouble(4 - 2 + 1) + 2;
                if (tiempoCajas[2] > ranTime) {
                    cajasLibres[2] = true;
                    clientesAtendidos++;
                    cola.remove();
                    if (ranTime > maximoEspera) {
                        maximoEspera = ranTime;
                    }
                    tiempoCajas[2] = 0;
                } else {
                    tiempoCajas[2]++;
                }
            } else if (!cajasLibres[3]) {
                double ranTime = r.nextDouble(4.5 - 2 + 1) + 2;
                if (tiempoCajas[3] > ranTime) {
                    cajasLibres[3] = true;
                    clientesAtendidos++;
                    cola.remove();
                    if (ranTime > maximoEspera) {
                        maximoEspera = ranTime;
                    }
                    tiempoCajas[3] = 0;
                } else {
                    tiempoCajas[3]++;
                }
            }

            sumaCola += cola.size();
            if (cola.size() > tamanoMaximo) {
                tamanoMaximo = cola.size();
            }

            // Añadir otro cliente que llegó cada unos minutos
            if (i % 3 == 0) {
                cola.add("ClienteNuevo" + numCliente++);
            }

            if (cajas4Abierta) {
                totalAbiertoCaja4++;
            }
        }

        System.out.println("Cantidad de clientes atendidos: " + clientesAtendidos);
        int tamanoPromedio = (int) (sumaCola / minutos);
        System.out.println("El tamaño promedio de la cola es: " + tamanoPromedio);
        System.out.println("El tamaño máximo de la cola fue: " + tamanoMaximo);
        System.out.println("El tiempo máximo de espera fue: " + maximoEspera);
        System.out.println("La caja 4 estuvo " + totalAbiertoCaja4 + " minutos abierta.");
        System.out.println("Cola al finalizar las 7 horas: " + cola);
    }
}
