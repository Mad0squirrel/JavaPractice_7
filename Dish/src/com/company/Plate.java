package com.company;

public class Plate extends Dish {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Plate(String material, String color, double radius) {
        super(material, color);
        this.radius = radius;
    }

    public String toString() {
        return "Tарелка{" +
                "Радиус: " + radius +
                ", Материал: " + material +
                ", Цвет: " + color +
                '}';
    }
}
