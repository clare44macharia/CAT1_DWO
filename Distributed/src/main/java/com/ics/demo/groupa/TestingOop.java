package com.ics.demo.groupa;

public class TestingOop {

    public static void main (String arg []){
        Rectangle rectangle = new Rectangle(12,11,ShapeType.TWO_D);
        System.out.println(rectangle.toString());

        Circle circle= new Circle(7, ShapeType.TWO_D);
        System.out.println(circle.toString());

        Triangle triangle= new Triangle(4,3, ShapeType.TWO_D);
        System.out.println(triangle.toString());

    }
}
