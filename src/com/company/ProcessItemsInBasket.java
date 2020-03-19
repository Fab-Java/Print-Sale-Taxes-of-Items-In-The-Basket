package com.company;

import java.util.*;
/**
 *  This class is set to process items in the Basket
 *  @author Fabrice Tchouani
 */

public class ProcessItemsInBasket {

    private ArrayList<ShoppingBaskets> itemOutputOne = new ArrayList<ShoppingBaskets>();
    ShoppingBaskets itemOne = new ShoppingBaskets();
    ShoppingBaskets itemTwo = new ShoppingBaskets();
    ShoppingBaskets itemThree = new ShoppingBaskets();

    private ArrayList<ShoppingBaskets> itemOutputTwo = new ArrayList<ShoppingBaskets>();
    ShoppingBaskets itemFour = new ShoppingBaskets();
    ShoppingBaskets itemFive = new ShoppingBaskets();

    private ArrayList<ShoppingBaskets> itemOutputThree = new ArrayList<ShoppingBaskets>();
    ShoppingBaskets itemSix = new ShoppingBaskets();
    ShoppingBaskets itemSeven = new ShoppingBaskets();
    ShoppingBaskets itemEight = new ShoppingBaskets();
    ShoppingBaskets itemNine = new ShoppingBaskets();

    /**
     * this method is to launch the application
     */
    public void launcher() {
        itemsInfoOne();
        itemsInfoTwo();
        itemsInfoThree();
        outputBasketOne();
        outputBasketTwo();
        outputBasketThree();
    }

    /**
     * This method is to get Items informations
     *
     */
    public void itemsInfoOne() {

        // output One
        itemOne.setItemPrice(16.00);
        itemTwo.setItemPrice(99.99);
        itemThree.setItemPrice(0.99);

        itemOne.setItemQuantity(1);
        itemTwo.setItemQuantity(1);
        itemThree.setItemQuantity(1);

        itemOne.setItemDescription("16lb bag of Skittles");
        itemTwo.setItemDescription("Walkman");
        itemThree.setItemDescription("Bag of Microwave Popcorn");

        itemOutputOne.add(itemOne);
        itemOutputOne.add(itemTwo);
        itemOutputOne.add(itemThree);

    }

    /**
     * This method is to get Items information
     *
     */
    public void itemsInfoTwo() {

        itemFour.setItemPrice(11.00);
        itemFive.setItemPrice(15001.25);

        itemFour.setItemQuantity(1);
        itemFive.setItemQuantity(1);

        itemFour.setItemDescription("Imported Bag of Vanilla-Hazelnut Coffee");
        itemFive.setItemDescription("Imported Vespa");

        itemOutputTwo.add(itemFour);
        itemOutputTwo.add(itemFive);

    }

    /**
     * This method is to get Items informations
     *
     */
    public void itemsInfoThree() {

        itemSix.setItemPrice(75.99);
        itemSeven.setItemPrice(55.00);
        itemEight.setItemPrice(10.00);
        itemNine.setItemPrice(997.99);

        itemSix.setItemQuantity(1);
        itemSeven.setItemQuantity(1);
        itemEight.setItemQuantity(1);
        itemNine.setItemQuantity(1);

        itemSix.setItemDescription("Imported crate of Almond Snickers");
        itemSeven.setItemDescription("Discman");
        itemEight.setItemDescription("Imported Bottle of wine");
        itemNine.setItemDescription("300# bag of Fair-Trade Coffee");

        itemOutputThree.add(itemSix);
        itemOutputThree.add(itemSeven);
        itemOutputThree.add(itemEight);
        itemOutputThree.add(itemNine);

    }

    /**
     *  Display the clients informations to the terminal window.
     */
    public void outputBasketOne() {
        System.out.println("=====================");
        System.out.println("Shopping Basket1: ");
        System.out.println("=====================");
        ShoppingBaskets ram;

        double total = 0.0;
        double tax = 0.0;
        for (int i=0; i < itemOutputOne.size(); i++) {
            ram = itemOutputOne.get(i);
            total += Math.round(ram.calculateItems() * 100.0)/100.0;
            tax += Math.round(ram.salesTaxes() * 20.0)/20.0;
            System.out.println(ram.toString());
        }
        System.out.println("Sales Taxes: " + "$" + String.format("%.2f", tax));
        System.out.println("Total: " + "$" + String.format("%.2f", total + tax));
    }

    /**
     *  Display the clients informations to the terminal window.
     */
    public void outputBasketTwo() {
        System.out.println();
        System.out.println("=====================");
        System.out.println("Shopping Basket2: ");
        System.out.println("=====================");
        ShoppingBaskets ram ;
        double total = 0.0;
        double tax = 0.0;
        for (int i=0; i < itemOutputTwo.size(); i++) {
            ram = itemOutputTwo.get(i);
            total += Math.round(ram.calculateItems() * 100.0)/100.0;
            tax += Math.round(ram.salesTaxes() * 20.0)/20.0;
            System.out.println(ram.toString());
        }
        System.out.println("Sales Taxes: " + "$" + String.format("%.2f", tax));
        System.out.println("Total: " + "$" + String.format("%.2f", total + tax));

    }
    /**
     *  Display the clients informations to the terminal window.
     */
    public void outputBasketThree() {
        System.out.println();
        System.out.println("=====================");
        System.out.println("Shopping Basket3: ");
        System.out.println("=====================");
        ShoppingBaskets ram;
        double total = 0.0;
        double tax = 0.0;
        for (int i=0; i < itemOutputThree.size(); i++) {
            ram = itemOutputThree.get(i);
            total += Math.round(ram.calculateItems() * 100.0)/100.0;
            tax += Math.round(ram.salesTaxes() * 20.0)/20.0;
            System.out.println(ram.toString());
        }
        System.out.println("Sales Taxes: " + "$" + String.format("%.2f", tax));
        System.out.println("Total: " + "$" + String.format("%.2f", total + tax));
    }
}
