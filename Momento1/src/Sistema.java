import java.util.Arrays;
//import java.util.Scanner;

public class Sistema {
    private Buque[] buques;
    private Contenedor[][] contenedores;
    //private Scanner sc = new Scanner(System.in);
    
    public Sistema(Buque[] buques, Contenedor[][] contenedores) {
        this.buques = buques;
        this.contenedores = contenedores;
    }

    public void menuRegistroBuques(Buque buque) {

    }

    public void menuRegistroContenedores(Contenedor contenedor) {

    }

    public double pesoContenedores() {
        double pesoTotal = 0.0;
        for (int i=0; i<this.contenedores.length; i++) {
            for (int j=0; j<this.contenedores[i].length; j++) {
                pesoTotal += this.contenedores[i][j].getPeso();
            }
        }
        return pesoTotal;
    }

    public Buque[] getBuques() {
        return buques;
    }

    public void setBuques(Buque[] buques) {
        this.buques = buques;
    }

    public Contenedor[][] getContenedors() {
        return contenedores;
    }

    public void setContenedors(Contenedor[][] contenedores) {
        this.contenedores = contenedores;
    }

    @Override
    public String toString() {
        return "Sistema [buques=" + Arrays.toString(buques) + ", contenedors=" + Arrays.toString(contenedores) + "]";
    }
}
