package com.ics.demo.groupa;

public class Triangle extends Shape implements Shape.PerimeterInterface {
    private double base;
    private double height;

    public Triangle(double base, double height, ShapeType shapeType) {
        super(shapeType);
        this.base = base;
        this.height = height;
        calculateArea();
        calculatePerimeter();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    void calculateArea(){
        area=0.5*base*height;
    }

    @Override
    public void calculatePerimeter() {
        double hypotenus_squared=base*base + height*height;
        double hypotenus= Math.sqrt(hypotenus_squared);
        perimeter= base+(hypotenus*2);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", shapeType=" + shapeType +
                '}';
    }
}
