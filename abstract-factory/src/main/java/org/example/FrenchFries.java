package org.example;

public class FrenchFries implements Product {
    String status="salt";

    protected  FrenchFries(){}

    public FrenchFries(String status){
        this.status = status;
    }

    @Override
    public void describe() {
        System.out.println("I am " + this.status + " fries");
    }
}
