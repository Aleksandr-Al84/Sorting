package com.zoo.animal;

public class IndianElephant extends Animal{
    public IndianElephant(String name, String existencePeriod, String classAnimal, Integer size) {
        super(name, existencePeriod, classAnimal, size);
    }

    @Override
    public void emittedSound() {
        System.out.println("infrasound");
    }
}
