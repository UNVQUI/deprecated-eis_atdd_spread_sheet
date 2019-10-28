package ar.edu.unq.eis;

public class Combo {
    private Coca coca;
    private Palitos palitos;

    public Combo(Coca coca, Palitos palitos) {

        this.coca = coca;
        this.palitos = palitos;
    }

    public static Combo de(Coca coca, Palitos palitos) {
        return new Combo(coca, palitos);
    }

    public Renta vender(int precioVenta) {
        return new Renta(precioVenta - coca.sumarCostoCon(palitos));
    }
}
