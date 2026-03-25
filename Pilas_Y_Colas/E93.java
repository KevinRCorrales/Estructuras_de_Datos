import java.util.Stack;

public class E93 {
    public static void main(String[] args) {
        String expresion = "[ (5+2) * (5+4) ] / 2"; // Expresion correcta
        String expresionMala = "[(4-2*5]/3"; // Expresion incorrecta, falta un parentesis
        String expresionMala2 = "[3/4}*[2*(3+4)]"; // Expresion incorrecta, cierre de corchete con llave

        // Procesar las expresiones
        verificarExpresion(expresion);
        verificarExpresion(expresionMala);
        verificarExpresion(expresionMala2);
    }

    public static void verificarExpresion(String expresion) {
        System.out.println("\nVerificando expresión: " + expresion);
        char[] charArray = expresion.toCharArray();
        Stack<String> p = new Stack<>(); // Crear pila
        int errores = 0;
        for (int i = 0; i < charArray.length; i++) {
            // Ingresar primer elemento si es un parentesis o corchete
            String caracter = "" + charArray[i];
            if (caracter.equals("(") || caracter.equals("[") || caracter.equals("{")) {
                p.push(caracter);
            } else {
                // Buscar el caracter que acompaña
                if (caracter.equals(")")) {
                    if (!p.peek().equals("(")) { // Usar peek solo para consultar
                        System.out.println("Error encontrado, cierre incorrecto entre: " + p.peek() + " y )");
                        errores++;
                    }
                    p.pop(); // Eliminar en cualquier caso para pasar a la siguiente verificación
                } else if (caracter.equals("]")) {
                    if (!p.peek().equals("[")) {
                        System.out.println("Error encontrado, cierre incorrecto entre: " + p.peek() + " y ]");
                        errores++;
                    }
                    p.pop();
                } else if (caracter.equals("}")) {
                    if (!p.peek().equals("{")) {
                        System.out.println("Error encontrado, cierre incorrecto entre: " + p.peek() + " y }");
                        errores++;
                    }
                    p.pop();
                }
            }
        }
        // if para verificar si la pila quedó vacía, si no está vacía quiere decir que
        // falta uno o más cierres en la expresión
        if (!p.isEmpty()) {
            System.out.println("La expresión no está correctamente cerrada, hay uno o más elementos sin cierre: " + p);
        } else {
            System.out.println("La expresión está cerrada. Esto tal vez no signifique que esté equilibrada.");
        }
        if (errores > 0) {
        System.out.println("Se encontraron " + errores + " errores de cierre.");
        } else {
            System.out.println("No se encontraron errores de cierre, todo está equilibrado.");
        }
    }
}

/*
 * Ejercicios para hacer:
 * 
 * Pilas: pág. libro 292 Ejer. 9.3 - 9.4
 * 
 * Colas: pág. libro 313 - 314 Ejer. 10.3 - 10.6
 */
