public class Producto {
    private String nombre;

    private double precio;

    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        stock = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        if (nombre != null & nombre != ""){
            this.nombre = nombre;
        }
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public void aumentarStock(int cantidad){
        if (cantidad > 0){
            stock += cantidad;
        }
    }

    public void reducirStock(int cantidad){
        if (cantidad > 0 & stock >= cantidad) {
            stock -= cantidad;
        }
    }
}
