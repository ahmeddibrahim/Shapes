package com.company;

public class Rectangle implements Shapes{

    private int length;
    private int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
    @Override
    public double calculatePerimeter() {
        return 2*(length+width);
    }
    public int getLength(){
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
