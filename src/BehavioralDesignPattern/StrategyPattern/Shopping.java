package BehavioralDesignPattern.StrategyPattern;

import BehavioralDesignPattern.StrategyPattern.PaymentStrategy.CreditCard;
import BehavioralDesignPattern.StrategyPattern.PaymentStrategy.Paytm;

import java.util.ArrayList;
import java.util.List;

public class Shopping {

    public static void main(String[] args) {
        User user=new User("Vikash");

        List<Product> productList=new ArrayList<>();
        Product book = new Product("Book", 450);
        Product pen = new Product("Pen", 50);
        productList.add(pen);
        productList.add(book);

        Cart cart1=new Cart(user, productList, new CreditCard());
        cart1.pay();

        Product food = new Product("Daily meal", 120);
        productList.add(food);
        Cart cart2=new Cart(user, productList, new Paytm());

        cart2.pay();

    }
}
