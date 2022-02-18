package edu.poniperro.fastbreaktruck.types;

import edu.poniperro.fastbreaktruck.behaviour.Item;
import edu.poniperro.fastbreaktruck.behaviour.Packing;
import edu.poniperro.fastbreaktruck.domain.Caja;

public abstract class Cereales implements Item {

    public Cereales(){}

    @Override
    public Packing empaquetado() {
        return new Caja();
    }

    @Override
    public String toString() {
        return this.outputFormatter();
    }
}
