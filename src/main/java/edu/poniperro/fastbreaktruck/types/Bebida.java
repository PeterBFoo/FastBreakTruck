package edu.poniperro.fastbreaktruck.types;

import edu.poniperro.fastbreaktruck.behaviour.Item;
import edu.poniperro.fastbreaktruck.behaviour.Packing;
import edu.poniperro.fastbreaktruck.domain.Tubo;

public abstract class Bebida implements Item {
    public Bebida(){}

    @Override
    public Packing empaquetado() {
        return new Tubo();
    }

    @Override
    public String toString() {
        return this.outputFormatter();
    }
}
