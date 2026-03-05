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
        String retorno = "Buque [id=" + id + ", contenedores=[";
        for (int i=0; i<contenedores.length; i++) {
            retorno += contenedores[i].toString() + " | ";
        }
        retorno += "]";
        return retorno;
    }
}
