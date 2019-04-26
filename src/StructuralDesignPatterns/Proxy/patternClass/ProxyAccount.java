package StructuralDesignPatterns.Proxy.patternClass;

import StructuralDesignPatterns.Proxy.bean.Account;
import StructuralDesignPatterns.Proxy.bean.Bank;

public class ProxyAccount implements Bank {

    Bank account=null;

    public ProxyAccount(String name, Double amount){
        this.account=new Account(name, amount);
    }

    @Override
    public void withdraw(Bank account, Double amount) {
        this.account.withdraw(account, amount);
    }

    @Override
    public Double getBalance() {
        return account.getBalance();
    }

   /* @Override
    public void withdraw(Account account, Double amount) {
        account.withdraw(account, amount);
    }

    @Override
    public void checkBalance(Account account) {
        account.checkBalance(account);
    }*/
}
