package StructuralDesignPatterns.Adapter.Example_2nd.adapter;

import StructuralDesignPatterns.Adapter.Example_2nd.bean.Cal;
import StructuralDesignPatterns.Adapter.Example_2nd.bean.Square;

public class SquareAdapter implements Cal{

    private Square square;

    public SquareAdapter(Square square) {
        this.square=square;
    }

    @Override
    public void area() {
        square.area();
    }
}
