public class Suma {
    public static void main(String[] args) {
    	int[] a = {2, 6, 8, 1, 20, 40, 7, 3, 5};
	int total = 0;

	for (int i=0; i<a.length; i++) {
	    total += a[i];
	}

	System.out.println("La suma es: " + total);
    }
}
