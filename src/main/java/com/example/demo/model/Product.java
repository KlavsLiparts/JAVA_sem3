package com.example.demo.model;

public class Product {
	private String title;
	private String description;
	private float price;
	private int quantity;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String desctription) {
		this.description = desctription;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public Product() {}
	public Product(String title, String desctription, float price, int quantity) {
		super();
		this.title = title;
		this.description = desctription;
		this.price = price;
		this.quantity = quantity;
	}
}
