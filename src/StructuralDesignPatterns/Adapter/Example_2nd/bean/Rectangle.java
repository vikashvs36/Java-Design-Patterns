package StructuralDesignPatterns.Adapter.Example_2nd.bean;


/*
* Note : We can not implement Cal interface in Rectangle class because the Rectangle class can be present in any
* Plugin or out of the project.
*
* */
public class Rectangle {
    public double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        System.out.println("Area of the Rectangle is : "+(length*breadth));
    }
}
