package com.samples.s01springcoreDI;

public class items {
	
	private int id;
	private String name;
	@Override
	public String toString() {
		return "items [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	private double price;
	private double quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
