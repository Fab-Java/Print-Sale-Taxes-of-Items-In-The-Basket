package com.company;
import java.util.*;
/**
 * This class defines  the number of Items in a shopping Basket
 * @author Fabrice Tchouani
 */
public class ShoppingBaskets {

    /**
     * creating  private variables
     */
    double taxItem;
    private int itemQuantity;
    private double itemPrice;
    private String itemDescription;
    private final double TAX_APPLICABLE = 0.1;
    private final double IMPORTED_TAX = 0.05;

    String[] theExemptItems = {"16lb bag of Skittles", "Bag of Microwave Popcorn", "300# bag of Fair-Trade Coffee"};
    String[] theImportedItemsWithExempts = {"Imported crate of Almond Snickers", "Imported Bag of Vanilla-Hazelnut Coffee"};
    String[] basicItems = {"Walkman", "Discman"};
    String[] importedButNoExempt = {"Imported Bottle of wine", "Imported Vespa"};


    /** set the new value of itemDescription of the t objects
     * @param newItemDescription
     */
    public void setItemDescription(String newItemDescription) {

        itemDescription = newItemDescription;
    }

    /**  get the new value of a item name  attribute of ShoppingBaskets objects
     *@return the value of the item
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Returns value of itemQuantity
     * @return
     */
    public int getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Sets new value of itemQuantity
     * @param
     */
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    /**
     * Returns value of itemPrice
     * @return
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets new value of itemPrice
     * @param
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    /**
     * This Method will just compute the total cost of an item per Quantity
     * @return the value of the total cost items
     */
    public double calculateItems() {

        return getItemQuantity() * getItemPrice();
    }

    /**
     * This method is to check the type of item
     * and do the sale taxes computation
     * @return values of sales taxes
     */
    public double salesTaxes() {

        List<String> listOfExempt = Arrays.asList(theExemptItems);
        List<String> listOfImportWith = Arrays.asList(theImportedItemsWithExempts);
        List<String> listOfBasic = Arrays.asList(basicItems);
        List<String> listOfImportButNoEx = Arrays.asList(importedButNoExempt);

        // this check if the item is not imported and its exempt. Therefore there is no tax
        if (listOfExempt.contains(getItemDescription())) {
            taxItem = 0.0;

        // this check if the item is not exempt but  imported. in this case it has 15%
        } else if (listOfImportWith.contains(getItemDescription())) {
            taxItem = (calculateItems() * (IMPORTED_TAX));

         // this check if the item is not exempt and is not imported. There for there is basic tax 10%
        } else  if(listOfBasic.contains(getItemDescription())) {
            taxItem = (calculateItems() * TAX_APPLICABLE);

        } else if (listOfImportButNoEx.contains(getItemDescription())) {
            taxItem = (calculateItems() * (IMPORTED_TAX + TAX_APPLICABLE));
        }
        return taxItem;
    }

    /**
     * [displayOutputOne description]
     * @return [description]
     */
    public String toString() {
        return "Quantity: " + getItemQuantity() + "\tDescription: "
                + getItemDescription() + ": " + String.format("%.2f", getItemPrice() + salesTaxes());
    }
}
