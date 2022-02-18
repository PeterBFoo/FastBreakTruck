package edu.poniperro.fastbreaktruck.behaviour;
import edu.poniperro.fastbreaktruck.domain.*;

public class FastBreakTruck {

    public FastBreakTruck(){}

    public static Desayuno prepararEyeHoles(){
        Eyeholes eyeholes = new Eyeholes();
        TurbulentJuice turbulentJuice = new TurbulentJuice();
        Desayuno desayuno = new Desayuno(eyeholes.pvp() + turbulentJuice.pvp());

        desayuno.addItem(eyeholes);
        desayuno.addItem(turbulentJuice);

        System.out.println("");
        return desayuno;

    }

    public static Desayuno prepararSmiggles() {
        Smiggles smiggles = new Smiggles();
        FleebJuice fleebJuice = new FleebJuice();
        Desayuno desayuno = new Desayuno(fleebJuice.pvp() + smiggles.pvp());

        desayuno.addItem(smiggles);
        desayuno.addItem(fleebJuice);

        System.out.println("");
        return desayuno;
    }

    public static void incluirJuguete(Desayuno desayuno) {
        Plumbus plumbus = new Plumbus();
        desayuno.addPriceToTotal(plumbus);
        desayuno.addItem(plumbus);
    }


}
