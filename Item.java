package com.firstlabassignment.shoppingcartapp;

import java.util.Comparator;

/**
 * @author Riya
 *
 */
public abstract class Item {

	/**
	 * Creating variable counter which
	 * increments statically to form unique
	 * id.
	 */
	private static int counter = 0;
	protected int id;
	private double price;
	
	/**
	 * Constructor to set price.
	 * @param price
	 */
	public Item(double price) {
		setPrice(price);
	}

	/**
	 * Method to auto increment and set id.
	 */
	public void increment()
	{
		id = ++counter;
		setId(id);
	}

	/**
	 * Method to set price of an item if it
	 * is valid and call increment.
	 * It prints error message if price is
	 * not valid.
	 * @param price price of an item
	 */
	public void setPrice(double price)
	{
		if (isValidPrice(price)) {
			this.price = price;
			increment();
		}else {
			System.out.println("\nPlease enter valid price.");
		}
		
	}

	/**
	 * @return the price
	 */
	public double getPrice()
	{
		return price;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the unique id of an item
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Method to check if the price is not 
	 * negative and valid.
	 * @param price
	 * @return price
	 */
	private boolean isValidPrice(double price)
	{
		return (price >=0);
	}

}

/**
 * This class implements comparator to sort the
 * arraylist of Item according to price.
 * @author Riya
 *
 */
class SortByPriceOfItem implements Comparator<Item> 
{ 
	/**
	 * Method to sort arraylist of Item in ascending
	 * order according to price.
	 * @param a,b reference of class Item
	 */
    public int compare(Item a, Item b) 
    { 
        return Double.compare(a.getPrice(), b.getPrice()); 
    } 
} 
