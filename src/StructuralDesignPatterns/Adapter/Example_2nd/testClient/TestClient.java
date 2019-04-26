package StructuralDesignPatterns.Adapter.Example_2nd.testClient;

import StructuralDesignPatterns.Adapter.Example_2nd.adapter.CircleAdapter;
import StructuralDesignPatterns.Adapter.Example_2nd.adapter.RectangleAdapter;
import StructuralDesignPatterns.Adapter.Example_2nd.adapter.SquareAdapter;
import StructuralDesignPatterns.Adapter.Example_2nd.bean.Cal;
import StructuralDesignPatterns.Adapter.Example_2nd.bean.Circle;
import StructuralDesignPatterns.Adapter.Example_2nd.bean.Rectangle;
import StructuralDesignPatterns.Adapter.Example_2nd.bean.Square;

public class TestClient {

    public static void main(String[] args) {
        Cal[] cals={new RectangleAdapter(new Rectangle(5,4)),
                new CircleAdapter(new Circle(5)),
                new SquareAdapter(new Square(5))};

        for (Cal cal:cals) {
            cal.area();
        }

    }
}
