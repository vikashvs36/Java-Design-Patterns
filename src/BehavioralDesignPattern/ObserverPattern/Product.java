package BehavioralDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

    List<Observer> observerList =new ArrayList<>();;
    private String productName;
    private String productType;
    String availability;

    public Product(String productName, String productType, String availability){
        this.productName=productName;
        this.productType=productType;
        this.availability=availability;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying to all the subscribers when product became available");
        for (Observer ob : observerList) {
            ob.update(this.availability);
        }
    }
}
