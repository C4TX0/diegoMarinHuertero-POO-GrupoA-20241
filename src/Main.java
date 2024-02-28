public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camiseta", 20.99, 50);

        System.out.println("Nombre del producto: " + producto1.getNombre());
        System.out.println("Precio del producto: $" + producto1.getPrecio());
        System.out.println("Stock del producto: " + producto1.getStock());

        producto1.setNombre("Pantalón");
        producto1.setPrecio(35.99);

        System.out.println("Nombre del producto actualizado: " + producto1.getNombre());
        System.out.println("Precio del producto actualizado: $" + producto1.getPrecio());

        producto1.aumentarStock(10);
        System.out.println("Stock del producto después de aumentar: " + producto1.getStock());

        producto1.reducirStock(5);
        System.out.println("Stock del producto después de reducir: " + producto1.getStock());
    }
}
