package com.test.model;

public class Fruits {
	
	private int id, price, quantity;
	private String name;
	
	public Fruits() {
	}
	public Fruits(int id, int price, int quantity, String name) {
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.name = name;
	}	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Fruits [id=" + id + ", price=" + price + ", quantity=" + quantity + ", name=" + name + "]";
	}
	
	
}
