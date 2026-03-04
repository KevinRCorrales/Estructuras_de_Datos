import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear la matriz para los contenedores y el array para los buques
        // Además crear el sistema de administración
        Contenedor[][] area = new Contenedor[10][10];
        Buque[] buques = new Buque[10];
        Sistema s = new Sistema(buques, area);

        // Menú con bucle do-while que solo sale si el usuario lo desea
        int input;
        do {
            System.out.println("Menú: Ingrese el número de la opción a ejecutar:");
            System.out.println("1. Acceso al menú de registro de buques.");
            System.out.println("2. Acceso al menú de registro de contenedores");
            System.out.println("3. Mostrar el peso total de los contenedores.");
            System.out.println("4. Listar de manera agrupada el origen de los contenedores.");
            System.out.println("5. Cierre de la aplicación.");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    s.menuRegistroBuques(new Buque());
                case 2:
                    System.out.println("Ingresa el peso del contenedor:");
                    double tempPeso = sc.nextDouble();
                    s.menuRegistroContenedores(new Contenedor(tempPeso));
                case 3:
                    System.out.println("El peso total de los contenedores es: " + s.pesoContenedores());
                
                default:
                    System.out.println("Valor no válido.");;
            }
        } while (input != 5);

        sc.close();
    }
}