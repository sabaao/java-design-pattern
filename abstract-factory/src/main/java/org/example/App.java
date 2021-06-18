package org.example;

public class App 
{
    public static void main( String[] args )
    {

        Factory factory = new FrenchFriesFactory();
        Product fries = factory.getProduct();
        fries.describe();
    }
}
