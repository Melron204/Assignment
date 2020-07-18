package com.montran.mojo;

public class Book extends Object{
	private int BookNo ; 
	private String BookTitle ; 
	private Double Price ;
	
	
public void input(int BookNo , String BookTitle, double Price) {
	this.BookNo=BookNo;
	this.BookTitle=BookTitle;
	this.Price=Price;
}
	private double TotalCost(int N) {
		
		return Price*N;
		
	}
	public double Purchase(int n) {
		return TotalCost(n);
	}

	public String toString() {
		return "Book Details [Book No=" + BookNo + ", name=" + BookTitle + ", price=" + Price + "]";
	}

}


