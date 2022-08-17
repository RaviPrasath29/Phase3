package com.samples.s01springcoreDI;

public class ShoppingCart {
	
	private items items;

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}

	public items getItems() {
		return items;
	}

	public void setItems(items items) {
		this.items = items;
	}
	
	

}
