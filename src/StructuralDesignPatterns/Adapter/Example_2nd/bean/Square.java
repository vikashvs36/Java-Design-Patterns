package StructuralDesignPatterns.Adapter.Example_2nd.bean;


/*
* Note : We can not implement Cal interface in Square class because the Square class can be present in any
* Plugin or out of the project.
*
* */
public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public void area(){
        System.out.println("Area of the Square is : "+(side*side));
    }
}
