import java.util.LinkedList;
import java.util.Queue;

public class E105 {
    public static void main(String[] args) {
        LinkedList<String[]> datos = new LinkedList<>();
        Queue<String[]> datosDia = new LinkedList<>();

        // Llenar los datos con valores de las jornadas anteriores
        datos.add(new String[]{"1932048", "Arduino CC"});
        datos.add(new String[]{"1230943", "KDE e.V"});
        datos.add(new String[]{"3284834", "System76"});
        datos.add(new String[]{"2345678", "Valve Corp"});
        datos.add(new String[]{"3821908", "Fastly"});

        System.out.println("Datos antes de la actualización:");
        for (int i = 0; i < datos.size(); i++) {
            System.out.println("NSS: " + datos.get(i)[0] +  " Entidad: " + datos.get(i)[1]);
        }

        // Llenar la cola con los datos de hoy
        datosDia.add(new String[]{"1230943", "SUSE"});
        datosDia.add(new String[]{"2345678", "Linux Foundation"});
        datosDia.add(new String[]{"3821908", "VideoLAN"});

        // Recorrer la lista enlazada y la cola para actualizar los datos
        while (!datosDia.isEmpty()) {
            String[] cadenaActual = datosDia.remove();
            for (int i = 0; i < datos.size(); i++) {
                if (datos.get(i)[0].equals(cadenaActual[0])) {
                    datos.get(i)[1] = cadenaActual[1];
                }
            }
        }

        System.out.println("Datos tras la actualización:");
        for (int i = 0; i < datos.size(); i++) {
            System.out.println("NSS: " + datos.get(i)[0] +  " Entidad: " + datos.get(i)[1]);
        }
    }
}
