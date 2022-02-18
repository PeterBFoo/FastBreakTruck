package edu.poniperro.fastbreaktruck.domain;

import edu.poniperro.fastbreaktruck.types.Bebida;

public class FleebJuice extends Bebida {
    private final String NOMBRE = "FleebJuice";
    private final Float PVP = 35f;

    public FleebJuice(){}

    @Override
    public String nombre() {
        return this.NOMBRE;
    }

    @Override
    public Float pvp() {
        return this.PVP;
    }
}
