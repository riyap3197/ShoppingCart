package com.firstlabassignment.shoppingcartapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * @author Riya
 *
 */
public class ShoppingCart {
	/**
	 * Creating variable to store
	 * total amount of items in the
	 * shopping cart.
	 */
	private double totalAmount, price;
	private String authorName, bookTitle;
	private String description, colour;
	Scanner input = new Scanner(System.in);
	
	public void displayMenu() {
		System.out.println("##############################");
		System.out.println("\t    MENU");
		System.out.println("##############################");
		System.out.println("1 - Add a book");
		System.out.println("2 - Add a giftcard");
		System.out.println("3 - Display shopping cart");
		System.out.println("4 - Exit");
	}
	ArrayList<Item> item = new ArrayList<Item>();
	/**
	 * Created array list of Item to 
	 * maintain list of items.
	 * 
	 * Method to input details of book and 
	 * instantiate Book while passing values
	 * to the constructor and also adding details namely
	 * author name, book title, price and id
	 * to arraylist.
	 */
	public void addBook() {
		System.out.println("Enter name of the author: ");
		authorName = input.nextLine();
		System.out.println("Enter title of the book: ");
		bookTitle = input.nextLine();
		System.out.println("Enter the price: ");
		price = input.nextDouble();
		input.nextLine();
		Book tempBook = new Book(authorName, bookTitle, price);
		if(tempBook.getPrice()>0) {
			item.add(tempBook);
		}
	}
	
	/**
	 * Method to input details of giftcard and
	 * instantiate Giftcard while passing values
	 * to the constructor and also adding details namely
	 * description, colour, price and id 
	 * to arraylist.
	 */
	public void addGiftcard() {
		System.out.println("Enter the card description: ");
		description = input.nextLine();
		System.out.println("Enter the colour of card: ");
		colour = input.nextLine();
		System.out.println("Enter the price: ");
		price = input.nextDouble();
		input.nextLine();
		Giftcard tempGiftcard = new Giftcard(description, colour, price);
		if(tempGiftcard.getPrice()>0) {
			item.add(tempGiftcard);
		}
	}
	
	/**
	 * Display items in the shopping cart
	 * sorted according to the ascending 
	 * order of price and also total amount.
	 */
	public void displayShoppingCart() {
		Collections.sort(item,new SortByPriceOfItem());
		
		System.out.println("##############################");
		System.out.println("\tShopping Cart");
		System.out.println("##############################");
		
		totalAmount = 0;
		for(int i=0; i<item.size(); i++) {
			System.out.println(item.get(i));
			totalAmount += item.get(i).getPrice();
		}
		
		System.out.println("\nTotal Amount: $" + totalAmount);
	}

}

