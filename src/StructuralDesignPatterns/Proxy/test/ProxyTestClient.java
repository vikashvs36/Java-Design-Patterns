package StructuralDesignPatterns.Proxy.test;

import StructuralDesignPatterns.Proxy.bean.Bank;
import StructuralDesignPatterns.Proxy.patternClass.ProxyAccount;

public class ProxyTestClient {


    public static void main(String[] args) {
        Bank account=new ProxyAccount("SBI", 5000.00);
        // Check balance
        System.out.println(account.getBalance());
        // Withdraw balance
        account.withdraw(account, 500.00);
        System.out.println(account.getBalance());
    }
}
