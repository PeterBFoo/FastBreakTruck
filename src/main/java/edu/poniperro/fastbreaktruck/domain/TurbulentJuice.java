package edu.poniperro.fastbreaktruck.domain;

import edu.poniperro.fastbreaktruck.types.Bebida;

public class TurbulentJuice extends Bebida {
    private final String NOMBRE = "Turbulent Juice";
    private final Float PVP = 30f;

    public TurbulentJuice(){}

    public String nombre() {
        return this.NOMBRE;
    }

    public Float pvp() {
        return this.PVP;
    }
}
