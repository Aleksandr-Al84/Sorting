package com.zoo.animal;

public class MarsupialWolf extends Animal{
    public MarsupialWolf(String name, String existencePeriod, String classAnimal, Integer size) {
        super(name, existencePeriod, classAnimal, size);
    }

    @Override
    public void emittedSound() {
        System.out.println("howl");
    }
}
