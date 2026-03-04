import java.util.Arrays;

public class Inventario {
    private Producto[] productos;

    public Inventario(Producto[] productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto p) {
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i] == null) { // Buscar un puesto vacío
                this.productos[i] = p;
                break; // Terminar el bucle para no llenar más espacios del array
            }
        }
    }

    public String buscarPorId(int id) {
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i].getId() == id) {
                return this.productos[i].toString();
            }
        }
        return null;
    }

    public void actualizarStock(int id, int nuevaCantidad) {
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i].getId() == id) {
                this.productos[i].setCantidadStock(nuevaCantidad);
                break;
            }
        }
    }

    public void ordenarPorPrecioDescendente(Producto[] productos) {
        int n = productos.length;
        boolean intercambiado;

        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (productos[j].getPrecio() < productos[j + 1].getPrecio()) {
                    Producto temp = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = temp;
                    intercambiado = true;
                }
            }
            if (!intercambiado) {
                break;
            }
        }

        // Ver el resultado
        for (int i=0; i<productos.length; i++) {
            System.out.println(productos[i].getPrecio());
        }
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "productos=" + Arrays.toString(productos) +
                '}';
    }
}
