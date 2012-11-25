package models;

import java.util.List;

public abstract class BaseBag {
	String name; 
	List<Item> items;	
	//String image; 
		
	public abstract boolean isTemplate();

	public BaseBag(String name, List<Item> items) {
		super();
		this.name = name;
		this.items = items;
	} 	
}
