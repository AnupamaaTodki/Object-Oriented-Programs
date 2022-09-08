package com.stockmanagement;

import java.util.Scanner;

public class StockMain {
	
	public static void main(String args[]) {
	
		
	Scanner scanner = new Scanner(System.in);
	StockPortfolio stockportfolio = new StockPortfolio();
	System.out.println("Please enter your choice");
	
	boolean check = true;
	while(check == true) {
		System.out.println("\n 1) Add Stock\n 2) Stock Value\n 3)Each Stock Value\n 4)debit amout\n 5)Total Stock Value");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			stockportfolio.addNumberOfStock();
			break;
			
		case 2:
			System.out.println(stockportfolio.totalStockValue());
			break;
			
		case 3:
			System.out.println(stockportfolio.totalEachStockValue());
			System.out.println(stockportfolio.list.toString());
			
		case 4:
			System.out.println(stockportfolio.debit());
			break;
			
		case 5:
			check = false;
			break;
			
		}
		//scanner.close();
	}
	}

}
