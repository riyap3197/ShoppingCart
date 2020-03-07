package com.firstlabassignment.shoppingcartapp;

/**
 * @author Riya
 *
 */
import java.util.Scanner;

public class ShoppingCartApp {
	
	private static Scanner input;
	/**
	 * This is a program for adding and displaying 
	 * items in shopping cart according to the 
	 * ascending order of the price.
	 * @param args
	 */
	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();
		input = new Scanner(System.in);
		/** 
        * Instantiated ShoppingCart and
        * declared input for taking input 
        * from the user  by using Scanner class.
        * Displaying Menu to add book or gift card,
        * display items or exit.
        */
		int inputChoice = 4;
		do {
			cart.displayMenu();
			inputChoice = input.nextInt();
			
			switch(inputChoice) {
				case 1: cart.addBook();
						break;
				case 2: cart.addGiftcard();
						break;
				case 3: cart.displayShoppingCart();
						break;
				case 4: break;
				default: System.out.println("Please enter valid input");
						break;
			}
			
		}while(inputChoice != 4);
	}

}





