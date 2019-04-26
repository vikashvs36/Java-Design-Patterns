package StructuralDesignPatterns.Adapter.Example_1nd.bean;

public class SocketAdapterImpl extends Socket implements SocketAdapter {


    @Override
    public Volt get120Volt() {
        Volt v=getVolt();
        return new Volt(v.getVolts());
    }

    @Override
    public Volt get12Volt() {
        Volt volt=getVolt();
        return new Volt(volt.getVolts()/10);
    }

    @Override
    public Volt get4Volt() {
        Volt volt=getVolt();
        return new Volt(volt.getVolts()/30);
    }
}
