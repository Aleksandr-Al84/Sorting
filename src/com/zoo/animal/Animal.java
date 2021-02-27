package com.zoo.animal;

public class Animal {
    private String name;
    private String existencePeriod;
    private String classAnimal;
    private Integer size;

    public Animal(String name, String existencePeriod, String classAnimal, Integer size) {
        this.name = name;
        this.existencePeriod = existencePeriod;
        this.classAnimal = classAnimal;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExistencePeriod() {
        return existencePeriod;
    }

    public void setExistencePeriod(String existencePeriod) {
        this.existencePeriod = existencePeriod;
    }

    public String getClassAnimal() {
        return classAnimal;
    }

    public void setClassAnimal(String classAnimal) {
        this.classAnimal = classAnimal;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    public void emittedSound(){
        System.out.println("roar");
    }
}
