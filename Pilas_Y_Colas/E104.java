import java.util.Stack;

public class E104 {
    public static void main(String[] args) {
        String[] archivo = new String[] {
                "784352094341098452385024832328320",
                "923489032480982384920384394083209",
                "390432094389248329482902095809385",
                "849832098439048357320948320958324",
                "934803948098549034850932848939385",
                "349943204208043209859450934829432"
        };

        String total = archivo[0];

        for (int i=1; i<archivo.length; i++) {
            total = sumar(total, archivo[i]);
        }

        System.out.println("La suma es: " + total);

    }

    public static String sumar(String numero1, String numero2){
        int lleva = 0;

        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();

        char[] primerNumero = numero1.toCharArray();
        char[] segundoNumero = numero2.toCharArray();

        Stack<Integer> suma = new Stack<>();

        for (int i = 0; i < primerNumero.length; i++) {
            pila1.push(primerNumero[i] - '0');
            
            try { // el segundoNumero puede estar más vacio que el primerNumero
                pila2.push(segundoNumero[i] - '0');
            } catch (Exception ArraYIndexOutOfBoundsException) {
                continue;
            }
        }

        System.out.println(pila1);
        System.out.println(pila2);

        int size;

        // Sumar los números
        if (pila1.size() > pila2.size()) {
            size = pila1.size();
        } else {
            size = pila2.size();
        }

        for (int i=0; i<size; i++) {
            int resultado;
            try {
                int pila2_pop = pila2.pop();
                resultado = pila1.pop() + pila2_pop + lleva;
            } catch (Exception EmptyStackException) {
                resultado = pila1.pop() + lleva;
            }
            if (resultado > 9){
                lleva = 1;
                resultado = resultado - 10;
            } else {
                lleva = 0;
            }
            suma.push(resultado);
        }

        if (lleva == 1) {
            suma.push(1);
        }

        String sumaString = "";
        System.out.println(suma);
        int newSize = suma.size();
        for (int i=0; i<newSize; i++){
            sumaString += suma.pop();
        }

        return sumaString;
    }
}
