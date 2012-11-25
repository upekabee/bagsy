package models;

import java.util.List;


public class Bag extends BaseBag {

	String userId; 
	
	@Override
	public boolean isTemplate() {
		return false;
	}
	
	public Bag(String name, List<Item> items, String userId) {
		super(name, items);
		this.userId = userId; 
	}	
}
