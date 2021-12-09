package com.company;

public class Pot extends Dish {
    protected double radius;
    protected double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Pot(String material, String color, double radius, double height) {
        super(material, color);
        this.radius = radius;
        this.height = height;
    }

    public String toString() {
        return "Кастрюля{" +
                "Радиус: " + radius +
                ", Высота: " + height +
                ", Материал: " + material +
                ", Цвет: " + color +
                '}';
    }
}
