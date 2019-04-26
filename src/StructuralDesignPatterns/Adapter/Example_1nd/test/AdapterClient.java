package StructuralDesignPatterns.Adapter.Example_1nd.test;

import StructuralDesignPatterns.Adapter.Example_1nd.bean.*;

public class AdapterClient {

    public static void main(String[] args) {

        SocketAdapter socketAdapter=new SocketAdapterImpl();
        Volt volt4=socketAdapter.get4Volt();
        Volt volt12=socketAdapter.get12Volt();
        Volt volt120=socketAdapter.get120Volt();

        System.out.println(volt4.getVolts());
        System.out.println(volt12.getVolts());
        System.out.println(volt120.getVolts());


    }
}
