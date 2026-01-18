public class Producto {
    int stock;
    boolean disponible;

    public void venderProducto(int cantidadAVender) {
        if (this.disponible && this.stock >= cantidadAVender && cantidadAVender > 0) {
            this.stock -= cantidadAVender;
        }
    }
}
