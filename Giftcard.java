package com.firstlabassignment.shoppingcartapp;

import java.util.Scanner;

/**
 * @author Riya
 *
 */
public class Giftcard extends Item{

	private String description, colour;
	Scanner input = new Scanner(System.in);
	
	/**
	 * Class constructor specifying description,
	 * colour and price.
	 * @param description description of the card
	 * @param colour colour of the card
	 * @param price price of the card
	 */
	public Giftcard(String description, String colour, double price) {
		super(price);
		this.description = description;
		this.colour = colour;
	}

	/**
	 * Returns the string representation.
	 */
	public String toString()
	{
		return "\nItem id: " + getId() + 
				"\nPrice: $"+ getPrice() + 
				"\nDescription: " + description + 
				"\nColour: " + colour;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
