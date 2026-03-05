import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear la matriz para los contenedores y el array para los buques
        // Además crear el sistema de administración
        String[] paises = {"Japón", "China", "Chile", "Espania"};
        Contenedor[][] area = new Contenedor[10][10];
        Buque[] buques = new Buque[10];
        Sistema s = new Sistema(buques, area, paises);

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
                    int opcion = submenu(
                        "1. Acceder al estado de buques.\n" +
                        "2. Llenar los buques.", sc
                    );
                    if (opcion == 1) {
                        Buque[] b = s.getBuques();
                        for (int i=0; i<b.length; i++) {
                            System.out.println(b[i]);
                        }
                    } else {
                        try {
                            // Acceder a un contenedor, si se produce NullPointerException
                            // los contenedores están vacíos y por ende no se pueden
                            // llenar los buques.
                            s.getContenedores()[0][0].getOrigen();
                        } catch (Exception NullPointerException) {
                            System.out.println("\nERROR: Los contenedores están vacíos, llenelos primero.\n");
                            break;
                        }
                        try {
                            // Intentar acceder a un buque, si NO se produce NullPointerException
                            // quiere decir que los buques ya están llenos y no se debería permitir
                            // sobre-escribirlos
                            s.getBuques()[0].getId();
                        } catch (Exception NullPointerException) {
                            // el Array esta vacio asi que se permite escribir en él
                            s.setBuques(llenarBuques(s.getContenedores()));
                            break;
                        }
                        System.out.println("\nError: Está intentado sobreescribir los buques, el arreglo está lleno.\n");
                    }
                    break;
                case 2:
                    int opcion2 = submenu(
                        "1. Acceder al estado de contenedores.\n" +
                        "2. Llenar los contenedores.", sc
                    );
                    if (opcion2 == 1) {
                        Contenedor[][] c = s.getContenedores();
                        for (int i = 0; i < c.length; i++) { // filas
                            for (int j = 0; j < c[0].length; j++) { // columnas
                                System.out.print(c[i][j] + " | ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    } else {
                        try {
                            s.getContenedores()[0][0].getId();
                        } catch (Exception NullPointerException) {
                            s.setContenedores(llenarContenedores(paises));
                            break;
                        }
                        System.out.println("\nError: Está intentando sobreescribir los contenedores, la matriz está llena.\n");
                    }
                    break;
                case 3:
                    System.out.println("El peso total de los contenedores es: " + s.pesoContenedores());
                    break;
                case 4:
                    s.origenesAgrupados();
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Valor no válido.");;
            }
        } while (true);
    }

    public static int submenu(String textoImprimir, Scanner scanner) {
        int opcion;
        while (true) {
            System.out.println("\n"+textoImprimir);
            System.out.print("Ingrese la opción que desea ejecutar: ");
            opcion = scanner.nextInt();
            if (opcion == 1 || opcion == 2) {
                return opcion;
            } else {
                System.out.println("\nOpción incorrecta, intente de nuevo...\n");
            }
        }
    }

    public static Contenedor[][] llenarContenedores(String[] paises) {
        Random r = new Random();
        Contenedor[][] contenedores = new Contenedor[10][10];
        int min = 100000;
        int max = 999999;
        int pMin = 10;
        int pMax = 35;
        for (int i = 0; i < contenedores.length; i++) { // filas
            for (int j = 0; j < contenedores[0].length; j++) { // columnas
                int peso = r.nextInt((pMax-pMin+1)) + pMin;
                int id = r.nextInt((max-min+1)) + min;
                String origen = paises[r.nextInt(((paises.length-1)-0+1) + 0)];
                contenedores[i][j] = new Contenedor(peso, id, origen);
            }
        }
        return contenedores;
    }

    public static Buque[] llenarBuques(Contenedor[][] contenedores) {
        Buque[] buques = new Buque[10];
        Random r = new Random();
        int max = 999999;
        int min = 100000;
        for (int i=0; i<buques.length; i++) {
            int id = r.nextInt((max-min+1)) + min;
            buques[i] = new Buque(id, contenedores[i]);
        }
        return buques;
    }
}