package edu.poniperro.fastbreaktruck.domain;

import edu.poniperro.fastbreaktruck.behaviour.Packing;

public class Tubo implements Packing {
    public Tubo(){}

    @Override
    public String envoltorio() {
        String TUBO = "Tubo";
        return TUBO;
    }
}
