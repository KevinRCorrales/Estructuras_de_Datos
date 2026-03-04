public class Contenedor {
    private double peso;

    public Contenedor(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Contenedor [peso=" + peso + "]";
    }

}
