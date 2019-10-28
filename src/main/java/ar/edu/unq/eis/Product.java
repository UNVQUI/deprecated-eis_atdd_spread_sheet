package ar.edu.unq.eis;

public interface Product {
    Renta vender(int precioVenta);

    int sumarCostoCon(Product otro);

    int precioCompra();
}
