package com.zoo;

import com.zoo.animal.*;

public class Main {

    public static void main(String[] args) {
        Animal Bear = new Animal("Bear", "now", "mammals", 2);
        Animal BlueWhale = new Animal("BlueWhale", "now", "mammals", 33);
        Animal IndianElephant = new Animal("IndianElephant", "now", "mammals", 3);
        Animal MarsupialWolf = new MarsupialWolf("MarsupialWolf", "not exist", "mammals",
                1);
        Animal Tardigrade = new Tardigrade("Tardigrade", "now", "arthropod", 0);
        Animal WildOx = new WildOx("WildOx", "not exist", "mammals", 2);

        System.out.print("Bear ");
        Bear.emittedSound();
        System.out.print("WildOx ");
        WildOx.emittedSound();

    }

}
