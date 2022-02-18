package edu.poniperro.fastbreaktruck.domain;

import edu.poniperro.fastbreaktruck.behaviour.Packing;

public class Caja implements Packing {
    public Caja(){}

    public String envoltorio() {
        String CAJA = "Caja";
        return CAJA;
    }
}
