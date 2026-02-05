public class Suma {
	public static void main(String[] args) {
		int[] a = { 2, 6, 8, 1, 20, 40, 7, 3, 5 };
		int total = 0;
		int sumaPares = 0;
		int sumaImpares = 0;

		System.out.println("Elementos en posiciones pares:");
		for (int i = 0; i < a.length; i++) {

			// Mostrar los elementos en posiciones pares
			if (i % 2 == 0) {
				System.out.println(a[i]);
			}

			total += a[i];
			// Suma de pares e impares
			if (a[i] % 2 == 0) {
				sumaPares += a[i];
			} else {
				sumaImpares += a[i];
			}
		}

		System.out.println("\nLa suma es de todos los elementos es: " + total);
		System.out.println("La suma de los elementos pares es: " + sumaPares);
		System.out.println("La suma de los elementos impares es: " + sumaImpares);
	}
}

/*
 * Ejercicios:
 * Obtener la suma de los números pares y los números impares
 * Mostrar los elementos que están en las posiciones pares del elemento
 */
