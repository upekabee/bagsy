package models;

import java.util.List;

public class TemplateBag extends BaseBag {

	public TemplateBag(String name, List<Item> items) {
		super(name, items);
	}

	@Override
	public boolean isTemplate() {
		return true;
	}

}
