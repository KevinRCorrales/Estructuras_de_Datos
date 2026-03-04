import java.util.Arrays;
import java.util.Random;

public class Sistema {
    private Buque[] buques;
    private Contenedor[][] contenedores;

    private String[] paises = {"Japón", "China", "Chile", "Espania"};

    public Sistema(Buque[] buques, Contenedor[][] contenedores) {
        this.buques = buques;
        this.contenedores = contenedores;
    }

    public Contenedor[][] llenarMatriz() {
        Random r = new Random();
        for (int i = 0; i < this.contenedores.length; i++) { // filas
            for (int j = 0; j < this.contenedores[0].length; j++) { // columnas
                int peso = r.nextInt((35-10+1)) + 10;
                int id = r.nextInt((999999-100000+1)) + 100000;
                String origen = paises[r.nextInt(((paises.length-1)-0+1) + 0)];
                this.contenedores[i][j] = new Contenedor(peso, id, origen);
            }
        }
        return this.contenedores;
    }

    public Buque[] llenarBuques() {
        Random r = new Random();
        for (int i=0; i<this.buques.length; i++) {
            int id = r.nextInt((999999-100000+1)) + 100000;
            this.buques[i] = new Buque(id, this.contenedores[i]);
        }
        return this.buques;
    }

    public double pesoContenedores() {
        double pesoTotal = 0.0;
        for (int i = 0; i < this.contenedores.length; i++) {
            for (int j = 0; j < this.contenedores[i].length; j++) {
                try { // Atrapar error en caso de que la memoria no tenga un contenedor guardado
                    pesoTotal += this.contenedores[i][j].getPeso();
                } catch (Exception NullPointerException) {
                    continue; // Ignorar el null y sumar el siguiente espacio si tiene un objeto
                }
            }
        }
        return pesoTotal;
    }

    public void origenesAgrupados() {
        int japoneses = 0;
        int chinos = 0;
        int chilenos = 0;
        int espanoles = 0;
        for (int i = 0; i < this.contenedores.length; i++) {
            for (int j = 0; j < this.contenedores[i].length; j++) {
                String origen = this.contenedores[i][j].getOrigen();
                if (origen.equals(paises[0])) {
                    japoneses++;
                } else if (origen.equals(paises[1])) {
                    chinos++;
                } else if (origen.equals(paises[2])) {
                    chilenos++;
                } else {
                    espanoles++;
                }
            }
        }
        System.out.println(
            japoneses + " Buques de Japón\n" +
            chinos + " Buques de China\n" +
            chilenos + " Buques de Chile\n" + 
            espanoles + " Buques de Espania"
        );
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
