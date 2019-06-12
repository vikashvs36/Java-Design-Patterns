package BehavioralDesignPattern.StrategyPattern;

import BehavioralDesignPattern.StrategyPattern.PaymentStrategy.Payment;

import java.util.List;

public class Cart {

    private User user;
    private List<Product> items;
    private Payment payment;

    public Cart() { }

    public Cart(User user, List<Product> items, Payment payment) {
        this.user = user;
        this.items = items;
        this.payment = payment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public double calculateAmount() {
        double amount=0.0;
        for (Product item:getItems()) {
            amount+=item.getPrice();
        }
        return amount;
    }

    public void pay() {
        double amount=calculateAmount();
        payment.pay(amount);
    }
}
