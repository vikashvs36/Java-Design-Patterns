package StructuralDesignPatterns.Adapter.Example_2nd.adapter;

import StructuralDesignPatterns.Adapter.Example_2nd.bean.Cal;
import StructuralDesignPatterns.Adapter.Example_2nd.bean.Circle;
import StructuralDesignPatterns.Adapter.Example_2nd.bean.Square;

public class CircleAdapter implements Cal{

    private Circle circle;

    public CircleAdapter(Circle circle) {
        this.circle=circle;
    }

    @Override
    public void area() {
        circle.area();
    }
}
