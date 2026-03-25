import java.util.Scanner;
import java.util.Stack;

public class E94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> p1 = new Stack<>();
        Stack<Integer> p2 = new Stack<>();
        Stack<Integer> p3 = new Stack<>();
        Stack<Integer> p4 = new Stack<>();
        Stack<Integer> p5 = new Stack<>();

        Stack<Integer>[] pilas = new Stack[] { p1, p2, p3, p4, p5 };

        Integer i, j;
        Integer n = 5;

        do {
            System.out.print("Ingrese i (o 0 para salir): ");
            i = sc.nextInt();
            if (i == 0) {
                break;
            }
            Integer iAbs = Math.abs(i);
            System.out.print("Ingrese j: ");
            j = sc.nextInt();
            if (i >= 1 && i <= n) {
                pilas[i-1].push(j);
            } else if (iAbs >= 1 && iAbs <= n) {
                if (pilas[iAbs-1].isEmpty()) {
                    System.out.println("Error, la pila está vacía.");
                } else {
                    pilas[iAbs-1].pop();
                }
            } else {
                System.out.println("Rango no válido.");
            }
        } while (i != 0);

        System.out.println("Pilas resultantes");
        for (int c = 0; c < pilas.length; c++) {
            System.out.println("Pila " + c + ": " + pilas[c]);
        }

        sc.close();
    }
}
