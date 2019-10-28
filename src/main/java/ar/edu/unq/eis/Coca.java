package ar.edu.unq.eis;

public class Coca implements Product {
    private final int precioCompra;

    public Coca(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public static Coca compraA(int precio) {
        return new Coca(precio);
    }

    @Override
    public Renta vender(int precioVenta) {

        return new Renta(precioVenta -   precioCompra);
    }

    @Override
    public int sumarCostoCon(Product otro) {

        return precioCompra + otro.precioCompra();

    }

    @Override
    public int precioCompra() {
        return precioCompra;
    }
}
