package com.zoo.animal;

public class Tardigrade extends Animal{
    public Tardigrade(String name, String existencePeriod, String classAnimal, Integer size) {
        super(name, existencePeriod, classAnimal, size);
    }

    @Override
    public void emittedSound() {
        System.out.println("not defined");
    }
}
