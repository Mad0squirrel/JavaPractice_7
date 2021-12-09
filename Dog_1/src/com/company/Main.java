package com.company;

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dachshund("Dina", 13, "dachshund");
        System.out.println(d1);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());

        Dachshund da1 = (Dachshund) d1;
        System.out.println(da1.getBreed());
        System.out.println();

        Dog d2 = new Labrador("Bob", 5, "labrador");
        System.out.println(d2);
        System.out.println(d2.getName());
        System.out.println(d2.getAge());

        Labrador l1 = (Labrador) d2;
        System.out.println(l1.getBreed());
    }
}
