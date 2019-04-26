package StructuralDesignPatterns.Flyweight.bean;

public class Circle implements Shape{

    private String color;

    public Circle(String color){
        System.out.println("Creating new circle object with color : "+color);
        this.color=color;
    }

    @Override
    public void draw(String color) {
        System.out.println("Circle is drowing by "+color+" color." );
    }
}
