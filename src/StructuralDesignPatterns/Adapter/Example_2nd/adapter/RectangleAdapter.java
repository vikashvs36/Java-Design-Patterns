package StructuralDesignPatterns.Adapter.Example_2nd.adapter;

import StructuralDesignPatterns.Adapter.Example_2nd.bean.Cal;
import StructuralDesignPatterns.Adapter.Example_2nd.bean.Circle;
import StructuralDesignPatterns.Adapter.Example_2nd.bean.Rectangle;

public class RectangleAdapter implements Cal{

    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle=rectangle;
    }

    @Override
    public void area() {
        rectangle.area();
    }
}
