package com.company;

public class Circle implements Shapes{


    private int radius;
    private final double pi = 3.14;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return pi*(radius*radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
