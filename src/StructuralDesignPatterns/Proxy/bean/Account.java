package StructuralDesignPatterns.Proxy.bean;

public class Account implements Bank {

    private String bankName;
    private Double amount;

    public Account(String bankName, Double amount) {
        this.bankName = bankName;
        this.amount = amount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public void withdraw(Bank account, Double amount) {
        if(getAmount() >= amount ){
            this.amount -= amount;
            System.out.println("you transaction has been successfully.");
        }
        else System.out.println("Your account balance is less than your withdraw amount : "+amount);
    }

    @Override
    public Double getBalance() {
        System.out.println("Fetching total amount...");
        return getAmount();
    }
}
