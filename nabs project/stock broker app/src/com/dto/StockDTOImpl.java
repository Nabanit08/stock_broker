package com.dto;

public class StockDTOImpl implements StockDTO{
	
	private String companyName;
	private int quantity;
	private int price;
	private int stockId;
	
	
	public StockDTOImpl() {}
	
	public StockDTOImpl(String companyName,int quantity,int price,int stockId) {
		super();
		this.companyName = companyName;
		this.quantity = 500;
		this.price = price;
		this.stockId = stockId;
	}
	@Override
	public int getStockId() {
		return stockId;
	}
	@Override
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	@Override
	public String getCompanyName() {
		return companyName;
	}
	@Override
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public int getQuantity() {
		return quantity;
	}
	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int getPrice() {
		return price;
	}
	@Override
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CompanyName : " + companyName + ", quantity : " + quantity + ", price : " + price + "\n";
	}
	
}
