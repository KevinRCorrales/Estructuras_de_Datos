public class EjecutarInventario {
    public static void main(String[] args) {
        // Crear los productos para pasarlos al Inventario como un array
        Producto p1 = new Producto(291832198, "Portatil Lenovo", 5000000.0, 50);
        Producto p2 = new Producto(321830212, "Celular Xiaomi", 1500000.0, 100);
        Producto p3 = new Producto(210983323, "IPad", 9000000.0, 40);
        Producto p4 = new Producto(903238303, "TV LG", 2500000.0, 70);
        Producto p5 = new Producto(692183290, "Portatil Asus", 3000000.0, 80);

        // Crear el inventario y pasarle los productos como array
        Producto[] pArray = new Producto[7];
        pArray[0] = p1;
        pArray[1] = p2;
        pArray[2] = p3;
        pArray[3] = p4;
        pArray[4] = p5;
        Inventario inv = new Inventario(pArray);

        // Crear un nuevo producto y añadirlo al inventario
        Producto p6 = new Producto(12839829, "Celular Samsung", 2000000.0, 90);
        inv.agregarProducto(p6);

        // Buscar el producto para ver si se guardó correctamente
        try {
            System.out.println(inv.buscarPorId(12839829));
            inv.actualizarStock(12839829, 9);
            // Verificar que el numero se actualizó correctamente
            System.out.println("La nueva cantidad es: " + inv.getProductos()[5].getCantidadStock());
        } catch (Exception NullPointerException) {
            System.out.println("No existe el producto con el id " + 12839829);
        }
    }
}
