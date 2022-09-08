package com.stockmanagement;

import java.util.ArrayList;

import java.util.Scanner;

public class StockPortfolio{

	Scanner scanner = new Scanner(System.in);

	ArrayList<Stock> list = new ArrayList<>();

	public void getStockData() {
		System.out.println("Enter the Stock name: ");
		String stockName = scanner.next();
		System.out.println("Enter the number of shares: ");
		int numberOfShares = scanner.nextInt();
		System.out.println("Enter stock price: ");
		double price = scanner.nextDouble();

		Stock stock = new Stock(stockName, numberOfShares, price);
		list.add(stock);
		System.out.println("Stock is added");
	}

	public void addNumberOfStock() {
		System.out.println("Enter number of stocks");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			getStockData();
			//scanner.close();
		}
	}

	public double totalStockValue() {
		double totalValue = 0.0;

		for (Stock stock : list) {
			totalValue += stock.getNoOfShares() * stock.getPriceOfStock();
			stock.setTotalValue(totalValue);
		}
		return totalValue;
	}
	
	public double totalEachStockValue() {
		double totalValue = 0.0;
		
		for (Stock stock : list) {
			totalValue = stock.getNoOfShares() * stock.getPriceOfStock();
			stock.setTotalValue(totalValue);
	}
         return totalValue;
	}
	
	public double debit() {
		@SuppressWarnings("unused")
		double remainingAmt = 0.0;
		System.out.println("Enter the amout to be debited");
		double withdrawAmout = scanner.nextDouble();
		if(withdrawAmout < totalStockValue()) {
	    remainingAmt = totalStockValue() - withdrawAmout;
		}
	else {
		System.out.println("Debit amount exceeded account balance");
		}
		return remainingAmt;
		//System.out.println("Remaining amout is : "+remainingAmt);
	}
	
	}
