import java.util.Stack;

public class ExplicacionPila {
    public static void main(String[] args) {
        Stack<String> p = new Stack<>();
        // Llenar con push
        p.push("Camilo");
        p.push("Rodrigo");
        p.push("Juanito");
        p.push("Maria");
        p.push("Pedro");

        System.out.println("Pila inicial: " + p);

        System.out.println("Tope: " + p.peek());

        System.out.println("Pila vacía: " + p.empty());

        // Eliminar elemento tope
        System.out.println(p.pop());

        System.out.println("Nueva pila: " + p);

        System.out.println(p.search("Camilo"));
        System.out.println(p.search("Rodrigo"));
        System.out.println(p.search("Juanito"));
        System.out.println(p.search("Maria"));
    }
}
