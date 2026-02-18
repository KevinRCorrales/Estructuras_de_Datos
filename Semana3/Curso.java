public class Curso {
    private int id;
    private String nombreCurso;
    private String profesor;
    private int cantidadEstudiantes;

    public Curso(int id, String nombreCurso, String profesor, int cantidadEstudiantes) {
        this.id = id;
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombreCurso=" + nombreCurso + ", profesor=" + profesor + ", cantidadEstudiantes="
                + cantidadEstudiantes + "]";
    }
}
