package com.company;

public class Square implements Shapes {
    private int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public double calculateArea(){
        return side*side;
    }
    @Override
    public double calculatePerimeter(){
        return 4*side;
    }

    public int getSide(){
        return side;
    }
    public void setSide(int side){
        this.side = side;
    }
}
