package CreationalDesignPatterns.AbstractFactory.factory;

import CreationalDesignPatterns.AbstractFactory.bean.Bank;
import CreationalDesignPatterns.AbstractFactory.bean.Icici;

public class IciciFactory implements BankAbstractFactory {
    public IciciFactory() {}

    @Override
    public Bank createBank() {
        return new Icici();
    }
}
