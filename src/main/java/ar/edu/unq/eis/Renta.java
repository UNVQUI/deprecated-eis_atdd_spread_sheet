package ar.edu.unq.eis;

public class Renta {
    private int valor;

    public Renta(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        Renta other = (Renta)o;

        return other.valor == valor;

    }

    @Override
    public String toString() {
        return "Renta{" +
                "valor=" + valor +
                '}';
    }
}
