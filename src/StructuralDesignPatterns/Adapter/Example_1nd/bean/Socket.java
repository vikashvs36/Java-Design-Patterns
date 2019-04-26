package StructuralDesignPatterns.Adapter.Example_1nd.bean;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
