import java.util.LinkedList;
import java.util.Queue;

public class ExplicacionCola {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Agregar a la cola
        q.add(26); // Usando add
        q.add(30);
        // Usando offer
        q.offer(20);
        q.offer(34);

        System.out.println(q);

        // Mostrar la cabeza de la cola usando element y peek
        System.out.println("Cabeza de la cola (con element): " + q.element());
        System.out.println("Cabeza de la cola (con peek): " + q.peek());

        // Eliminar de la cabeza de la cola (con poll y remove)
        System.out.println("Elemento eliminado con poll: " + q.poll()); //26
        System.out.println("Elemento eliminado con remove: " + q.remove()); //30

        System.out.println("Nueva cola: " + q);

        System.out.println("Tamaño de la cola: " + q.size());
    }
}
