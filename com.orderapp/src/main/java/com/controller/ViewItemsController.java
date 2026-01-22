package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

class Item {

	private int itemId;
	
	private String itemName;
	
	private float price;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	
	
	

}

 @RestController
public class ViewItemsController {
	 
	 @Autowired
	 RestTemplate restTemplate;
	 
	 @GetMapping("/viewitems")
	 
	 public List<Item> getItems() 
	 { 
		 
		 
		 
		 String url="http://localhost:9953/itemslist/items";
		 
		 Item[] itemarray=restTemplate.getForObject(url,Item[].class);
		 return Arrays.asList(itemarray);
		 
		 
	 }
	 
	 
	 

	
}
