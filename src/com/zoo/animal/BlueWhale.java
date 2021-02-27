package com.zoo.animal;

public class BlueWhale extends Animal{
    public BlueWhale(String name, String existencePeriod, String classAnimal, Integer size) {
        super(name, existencePeriod, classAnimal, size);
    }

    @Override
    public void emittedSound() {
        System.out.println("whale song");
    }
}
