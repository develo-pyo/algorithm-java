package Java.Generic;

import java.util.ArrayList;
import java.util.List;

public class Cart<T> {
	
	private List<T> items;
	
	public Cart() {
		if(items == null)items = new ArrayList<>();
	}
	
	public void setItem(T item) {
		this.items.add(item);
	}
	
	public List<T> getItems() {
		return items;
	}
	
}
