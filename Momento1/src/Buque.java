import java.util.Arrays;

public class Buque {
    private int id;
    private Contenedor[] contenedores;

    public Buque(int id, Contenedor[] contenedores) {
        this.id = id;
        this.contenedores = contenedores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contenedor[] getContenedores() {
        return contenedores;
    }

    public void setContenedores(Contenedor[] contenedores) {
        this.contenedores = contenedores;
    }

    @Override
    public String toString() {
        return "Buque [id=" + id + ", contenedores=" + Arrays.toString(contenedores) + "]";
    }
}
