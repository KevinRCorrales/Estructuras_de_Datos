public class Sistema {
    private Buque[] buques;
    private Contenedor[][] contenedores;
    private String[] paises;

    public Sistema(Buque[] buques, Contenedor[][] contenedores, String[] paises) {
        this.buques = buques;
        this.contenedores = contenedores;
        this.paises = paises;
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
            japoneses + " contenedores de Japón\n" +
            chinos + " contenedores de China\n" +
            chilenos + " contenedores de Chile\n" + 
            espanoles + " contenedores de Espania"
        );
    }

    public Buque[] getBuques() {
        return buques;
    }

    public void setBuques(Buque[] buques) {
        this.buques = buques;
    }

    public Contenedor[][] getContenedores() {
        return contenedores;
    }

    public void setContenedores(Contenedor[][] contenedores) {
        this.contenedores = contenedores;
    }

    public String[] getPaises() {
        return paises;
    }

    public void setPaises(String[] paises) {
        this.paises = paises;
    }

    @Override
    public String toString() {
        String retorno = "Sistema [buques=";
        for (int i=0; i<buques.length; i++) {
            retorno += buques[i].toString() + " | ";
        }
        retorno += "]";
        return retorno;
    }
}
