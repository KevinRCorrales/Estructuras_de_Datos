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
        for (int i=0; i<this.productos.length; i++) {
            if (this.productos[i].getId() == id) {
                this.productos[i].setCantidadStock(nuevaCantidad);
                break;
            }
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
