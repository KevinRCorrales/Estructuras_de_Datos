import javax.swing.JOptionPane;

public class EjecutarCurso {
    public static void main(String[] args) {
        Curso[] c = new Curso[5]; // Declarar arreglo

        // Llenar el arreglo con los cursos
        c[0] = new Curso(102999, "Inglés IV", "Andrea", 29);
        c[1] = new Curso(385903, "Algoritmia", "Andres", 23);
        c[2] = new Curso(102345, "Desarrollo Web", "María", 19);
        c[3] = new Curso(123433, "Humanidades II", "Diego", 31);
        c[4] = new Curso(102454, "Lógica Matemática", "Manuel", 25);

        // Declarar la cantidad de estudiantes en 0
        int totalEstudiantes = 0;

        // Recorrer los cursos y sumar a totalEstudiantes
        for (int i=0; i<c.length; i++) {
            totalEstudiantes += c[i].getCantidadEstudiantes();
        }

        // Mostrar la cantidad de estudiantes obtenida
        JOptionPane.showMessageDialog(null, "La cantidad de estudiantes en todos los cursos es: " + totalEstudiantes);
    }
}
