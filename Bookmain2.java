package com.montran.main;

import java.util.Scanner;

import com.montran.mojo.Book;


public class Bookmain2 {
	public static void main(String[] args) {
		Book book = new Book();
		try (Scanner scanner = new Scanner(System.in)) {
			int N;

			book.input(101, "Java Beginner", 2000);
		
			System.out.println(book);

			System.out.println("Enter number of books");
			N = scanner.nextInt();
			if (N>0)
				System.out.println("Total amount to be paid is"+book.Purchase(N));
			
			else
				
				System.out.println("Invalid entry");

		
		}

	
	
	}
}
