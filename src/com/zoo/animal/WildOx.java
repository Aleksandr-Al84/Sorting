package com.zoo.animal;

public class WildOx extends Animal{
    public WildOx(String name, String existencePeriod, String classAnimal, Integer size) {
        super(name, existencePeriod, classAnimal, size);
    }

    @Override
    public void emittedSound() {
        System.out.println("Muuuu");
    }
}
