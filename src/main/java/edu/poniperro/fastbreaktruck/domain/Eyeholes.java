package edu.poniperro.fastbreaktruck.domain;

import edu.poniperro.fastbreaktruck.types.Cereales;

public class Eyeholes extends Cereales {
    private final String NOMBRE = "Eyeholes";
    private final Float PVP = 25f;

    public Eyeholes(){}

    public String nombre() {
        return this.NOMBRE;
    }

    public Float pvp() {
        return this.PVP;
    }
}
