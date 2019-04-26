package StructuralDesignPatterns.Flyweight.test;

import StructuralDesignPatterns.Flyweight.FlyWeightPattern.FlyweightPattern;
import StructuralDesignPatterns.Flyweight.bean.Shape;

public class FlyweightDemo {

    private static String[] colors={"Red", "Green", "White", "Yellow", "Black"};
    private static Shape shape=new FlyweightPattern();

    public static void main(String[] args) {

        for (int i=1; i<=20; i++) {
            shape.draw(colors[getRandomNumber(colors.length)]);
        }

    }

    private static int getRandomNumber(int tillNumber){
        return (int)(Math.random() * tillNumber);
    }
}
