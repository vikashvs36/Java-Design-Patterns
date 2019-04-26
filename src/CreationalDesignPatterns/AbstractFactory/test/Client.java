package CreationalDesignPatterns.AbstractFactory.test;

import CreationalDesignPatterns.AbstractFactory.bean.Bank;
import CreationalDesignPatterns.AbstractFactory.factory.BankFactory;
import CreationalDesignPatterns.AbstractFactory.factory.IciciFactory;
import CreationalDesignPatterns.AbstractFactory.factory.SbiFactory;

public class Client {

    public static void main(String[] args) {
        Bank sbiBank= BankFactory.createBank(new SbiFactory());
        Bank iciciBank= BankFactory.createBank(new IciciFactory());

        System.out.println("Bank Name : "+sbiBank.getName());
        System.out.println("Bank Name : "+iciciBank.getName());
    }
}
