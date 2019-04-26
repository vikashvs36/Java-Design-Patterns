package CreationalDesignPatterns.AbstractFactory.bean;

public class Icici implements Bank {

    private BankName name;

    public Icici() {
        this.name = BankName.ICIC;
    }

    @Override
    public BankName getName() {
        return name;
    }

    public void setName(BankName name) {
        this.name = name;
    }
}
