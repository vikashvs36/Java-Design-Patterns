package CreationalDesignPatterns.AbstractFactory.factory;

import CreationalDesignPatterns.AbstractFactory.bean.Bank;

public class BankFactory{

    public static Bank createBank(BankAbstractFactory baf) {
        return baf.createBank();
    }
}
