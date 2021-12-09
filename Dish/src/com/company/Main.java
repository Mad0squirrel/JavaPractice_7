package com.company;

public class Main {

    public static void main(String[] args) {
	Dish d1 = new Plate("пластмасса", "белый", 9.0);
    System.out.println(d1);
    System.out.println(d1.getMaterial());
    System.out.println(d1.getColor());

    Plate p1 = (Plate) d1;
    System.out.println(p1.getRadius());
    System.out.println();

    Dish d2 = new Pot("алюминий", "серый", 11.5, 17.0);
    System.out.println(d2);
    System.out.println(d2.getMaterial());
    System.out.println(d2.getColor());

    Pot p2 = (Pot) d2;
    System.out.println(p2.getRadius());
    System.out.println(p2.getHeight());


    }
}
