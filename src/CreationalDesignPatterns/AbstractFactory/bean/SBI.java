package CreationalDesignPatterns.AbstractFactory.bean;

public class SBI implements Bank {

    private BankName name;

    public SBI() {
        this.name= BankName.SBI;
    }

    public void setName(BankName name) {
        this.name = name;
    }

    @Override
    public BankName getName() {
        return name;
    }
}
