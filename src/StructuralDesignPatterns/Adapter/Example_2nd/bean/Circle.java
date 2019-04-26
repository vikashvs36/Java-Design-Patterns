package StructuralDesignPatterns.Adapter.Example_2nd.bean;


/*
* Note : We can not implement Cal interface in Circle class because the Circle class can be present in any
* Plugin or out of the project.
*
* */
public class Circle {
    public static final double PI = 3.147;
    double r;
    public Circle(int r){
        this.r=r;
    }

    public void area(){
        System.out.println("Area of the circle is : "+PI*r);
    }
}
