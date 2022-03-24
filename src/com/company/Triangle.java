package com.company;

public class Triangle implements Shapes{

    private int height;
    private int base;
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int height,int base,int side1,int side2,int side3){
       this.height = height;
       this.base = base;
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
    }
    @Override
    public double calculateArea() {
        return (int)0.5*base*height;
    }
    @Override
    public double calculatePerimeter() {
        return side1+side2+side3;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
}
