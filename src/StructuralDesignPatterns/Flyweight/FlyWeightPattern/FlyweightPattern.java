package StructuralDesignPatterns.Flyweight.FlyWeightPattern;

import StructuralDesignPatterns.Flyweight.bean.Circle;
import StructuralDesignPatterns.Flyweight.bean.Shape;

import java.util.HashMap;
import java.util.Map;

public class FlyweightPattern implements Shape {

    private Shape shape;

    private static Map<String, Shape> shapeMap=new HashMap<>();

    public void draw(String color){

        if(shapeMap.containsKey(color)){ shapeMap.get(color); }

        else {
            shape=new Circle(color);
            shapeMap.put(color, shape);
        }

        shape.draw(color);
    }
}
