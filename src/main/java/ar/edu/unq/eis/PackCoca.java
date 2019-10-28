package ar.edu.unq.eis;

public class PackCoca {
    private int cantidad;
    private int precioCompra;

    public PackCoca(int cantidad, int precioCompra) {

        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
    }

    public static PackCoca comprarTantasA(int cantidad, int precioCompra) {
        return new PackCoca(cantidad, precioCompra);
    }

    public Renta venderUna(int precioVenta) {
        return item().vender(precioVenta);
    }

    public Coca item() {
        return Coca.compraA(precioCompra / cantidad);
    }
}
