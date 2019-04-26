package CreationalDesignPatterns.AbstractFactory.factory;

import CreationalDesignPatterns.AbstractFactory.bean.Bank;
import CreationalDesignPatterns.AbstractFactory.bean.SBI;

public class SbiFactory implements BankAbstractFactory {


    public SbiFactory() { }

    @Override
    public Bank createBank() {
        return new SBI();
    }
}
