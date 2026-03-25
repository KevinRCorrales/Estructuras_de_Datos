import java.util.LinkedList;
import java.util.Queue;

public class E103 {
    public static void main(String[] args) {
        Queue<String> caja1 = new LinkedList<>();
        Queue<String> caja2 = new LinkedList<>();
        Queue<String> caja3 = new LinkedList<>();

        Queue<String> esperandoCarrito = new LinkedList<>();

        // Simular que queda solo un carrito disponible
        int carritos = 1;

        // Simular que los demás estan ocupados con clientes en caja
        int clientesPorCaja = 8;
        for (int i=0; i<clientesPorCaja; i++) {
            caja1.add("Cliente" + i);
            caja2.add("Cliente" + i);
            caja3.add("Cliente" + i);
        }

        System.out.println("Estado del supermercado antes de la simulación:");
        System.out.println("Cantidad de carritos: " + carritos + "/25");
        System.out.println("En espera de carrito: " + esperandoCarrito);
        System.out.println("Caja1" + caja1);
        System.out.println("Caja2" + caja2);
        System.out.println("Caja3" + caja3);

        // Simular que llegaron dos clientes nuevos
        String nuevo1 = "ClienteNuevo1";
        String nuevo2 = "ClienteNuevo2";

        // El cliente nuevo 1 obtiene el carrito y el nuevo 2 queda en cola de espera
        // Además llega un tercer y un cuarto cliente y quedan también en espera
        String nuevo3 = "ClienteNuevo3";
        String nuevo4 = "ClienteNuevo4";
        carritos = carritoParaCliente(nuevo1, carritos, esperandoCarrito); // Obtiene el carro y se va por sus compras
        carritos = carritoParaCliente(nuevo2, carritos, esperandoCarrito);
        carritos = carritoParaCliente(nuevo3, carritos, esperandoCarrito);
        carritos = carritoParaCliente(nuevo4, carritos, esperandoCarrito);

        System.out.println("Estado tras la llegada de 4 clientes:");
        System.out.println("Cantidad de carritos: " + carritos);
        System.out.println("En espera de carrito: " + esperandoCarrito);

        // Simular que un cliente terminó su compra en la caja 2
        // y libera un carrito
        System.out.println("Cliente termina su compra en caja 2...");
        caja2.remove();
        carritos++;
        System.out.println("Carritos: " + carritos);

        // Un cliente termina su compra y va a la caja mas vacia
        System.out.println("Cliente ha terminado su compra...");
        menor(caja1, caja2, caja3).add(nuevo1);

        System.out.println("Ahora las cajas tienen:");
        System.out.println("Caja1" + caja1);
        System.out.println("Caja2" + caja2);
        System.out.println("Caja3" + caja3);

        // Ahora el cliente en espera puede tomar un carrito
        System.out.println("Un cliente toma un carro disponible...");
        esperandoCarrito.remove();
        carritos--;
        System.out.println("Fila de espera por carro: " + esperandoCarrito);
        System.out.println("Ahora hay " + carritos + " carritos.");


        System.out.println("Estado del supermercado tras la simulación:");
        System.out.println("Cantidad de carritos: " + carritos + "/25");
        System.out.println("En espera de carrito: " + esperandoCarrito);
        System.out.println("Caja1" + caja1);
        System.out.println("Caja2" + caja2);
        System.out.println("Caja3" + caja3);
    }

    public static int carritoParaCliente(String cliente, int carritos, Queue<String> colaDeEspera) {
        if (carritos >= 1) {
            carritos--;
        } else {
            colaDeEspera.add(cliente);
        }
        return carritos;
    }

    public static Queue<String> menor(Queue<String> caja1, Queue<String> caja2, Queue<String> caja3) {
        Queue<String> menor;
        int valor1 = caja1.size();
        int valor2 = caja2.size();
        int valor3 = caja3.size();
        if (valor1 < valor3 && valor1 < valor2) {
            menor = caja1;
        } else if (valor2 < valor3) {
            menor = caja2;
        } else {
            menor = caja3;
        }
        return menor;
    }
}
