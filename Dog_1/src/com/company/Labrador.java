package com.company;

public class Labrador extends Dog {

    protected String breed;

    public Labrador(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Labrador(String breed) {
        super();
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        return "Dog{" +
                "breed=" + breed +
                ", name=" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
