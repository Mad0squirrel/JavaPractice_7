package com.company;

public class Dachshund extends Dog {

    protected String breed;

    public Dachshund(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dachshund(String breed) {
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
