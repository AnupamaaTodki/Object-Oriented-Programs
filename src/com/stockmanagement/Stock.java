package com.stockmanagement;

public class Stock {
	
	private String stockName;
	private int noOfShares;
	private double priceOfStock;
	private double totalValue;
	
	public Stock() {
	
	}
	
	public Stock(String companyName, int numberOfShares, double price) {
	this.stockName = companyName;
	this.noOfShares = numberOfShares;
	this.priceOfStock = price;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int numberOfShares) {
		this.noOfShares = numberOfShares;
	}

	public double getPriceOfStock() {
		return priceOfStock;
	}

	public void setPriceOfStock(double stockPrice) {
		this.priceOfStock = stockPrice;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = getNoOfShares() * getPriceOfStock();
	}

	@Override
	public String toString() {
		return "Company =" + stockName + ",\n Number of Shares=" + noOfShares + "\n Price of Stock=" + priceOfStock
				+ "\n totalValue=" + getTotalValue();
	}
	

}
