package com.Barton;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("total Burger price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("healthy","Bacon",  6.79);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("lentils", 3.41);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());

//        DeluxeBurger db = new DeluxeBurger();
//        db.itemizeHamburger();
//        db.addHamburgerAddition1("Show");
    }
}
