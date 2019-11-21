package design_pattern.observer2;

import java.util.ArrayList;

public class TextField implements Component{
	private ArrayList<Listener> listeners;
	private String s;
	
	public TextField() {
		this.listeners = new ArrayList<Listener>();
	}
	
	@Override
	public void addListener(Listener l) {
		listeners.add(l);
		System.out.println("listener added!");
	}

	@Override
	public void removeListener(Listener l) {
		int idx = listeners.indexOf(l);
		listeners.remove(idx);
		System.out.println("listener removed!");
	}

	@Override
	public void notifyListeners() {
		for(Listener l : listeners) {
			l.performAction();
		}
	}
	
	public void setText(String s) {
		this.s = s;
	}
	
	public String getText() {
		return s;
	}

}
