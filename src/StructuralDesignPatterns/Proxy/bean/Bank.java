package StructuralDesignPatterns.Proxy.bean;

public interface Bank {

    void withdraw(Bank account, Double amount);
    Double getBalance();
}
