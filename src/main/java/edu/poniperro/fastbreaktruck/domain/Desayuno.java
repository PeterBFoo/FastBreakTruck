package edu.poniperro.fastbreaktruck.domain;

import edu.poniperro.fastbreaktruck.behaviour.Item;

import java.util.ArrayList;
import java.util.List;

public class Desayuno {
    private Float total;
    private List<Item> items = new ArrayList<Item>();

    public Desayuno(Float coste){
        this.total = coste;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void addItem(Item item) {
        getItems().add(item);
    }

    public void mostrarItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Float getCoste() {
        return this.total;
    }

    public void addPriceToTotal(Item item){
        this.total += item.pvp();
    }
}
