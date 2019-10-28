package ar.edu.unq.eis;

public class Palitos implements Product {
    private int precioDeCompra;

    public Palitos(int precioDeCompra) {

        this.precioDeCompra = precioDeCompra;
    }

    public static Palitos comprarA(int precioDeCompra) {
        return new Palitos(precioDeCompra);
    }

    @Override
    public Renta vender(int precioVenta) {
        return new Renta(18);
    }

    @Override
    public int sumarCostoCon(Product otro) {
        return precioDeCompra + otro.precioCompra();
    }

    @Override
    public int precioCompra() {
        return precioDeCompra;
    }
}
