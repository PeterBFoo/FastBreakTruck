package edu.poniperro.fastbreaktruck.behaviour;

import java.util.Formatter;

public interface Item {
    public String nombre();
    public Packing empaquetado();
    public Float pvp();

    default String outputFormatter() {

        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder);

        formatter.format("Item: %1$s, Empaquetado: %2$s, Precio: %3$s",
                this.nombre(), this.empaquetado().envoltorio(), this.pvp());

        formatter.close();
        return stringBuilder.toString();
    }
}
