package com.firstlabassignment.shoppingcartapp;

import java.util.Scanner;

/**
 * @author Riya
 *
 */
public class Book extends Item{

	private String authorName, bookTitle;
	Scanner input = new Scanner(System.in);
	
	/**
	 * Class constructor specifying author name,
	 * book title and price.
	 * @param authorName name of the author
	 * @param bookTitle name of the book
	 * @param price price of the book
	 */
	public Book(String authorName, String bookTitle, double price) {
		super(price);
		this.authorName = authorName;
		this.bookTitle = bookTitle;
	}

	/**
	 * Returns the string representation.
	 */
	public String toString()
	{
		return "\nItem id: " + getId() + 
				"\nPrice: $"+ getPrice() + 
				"\nAuthor Name: " + authorName + 
				"\nBook Title: " + bookTitle;
	}

	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/**
	 * @return the bookTitle
	 */
	public String getBookTitle() {
		return bookTitle;
	}

	/**
	 * @param bookTitle the bookTitle to set
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

}