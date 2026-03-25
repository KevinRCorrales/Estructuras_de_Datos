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

        String sumaString = sumar(archivo[0], archivo[1]);
        String sumaString2 = sumar(archivo[2], archivo[3]);
        String sumaString3 = sumar(archivo[4], archivo[5]);

        String sumaString4 = sumar(sumaString, sumaString2);

        System.out.println("La suma es: " + sumar(sumaString4, sumaString3));

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
            pila2.push(segundoNumero[i] - '0');
        }

        System.out.println(pila1);
        System.out.println(pila2);

        // Sumar los números
        int size = pila1.size();
        for (int i=0; i<size; i++){
            int resultado = pila1.pop() + pila2.pop() + lleva;
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
