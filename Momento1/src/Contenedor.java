public class Contenedor {
    private int peso;
    private int id;
    private String origen;

    public Contenedor(int peso, int id, String origen) {
        this.peso = peso;
        this.id = id;
        this.origen = origen;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Contenedor [peso=" + peso + ", id=" + id + ", origen=" + origen + "]";
    }
}
