package design_pattern.observer2;

import java.util.ArrayList;

public class Button implements Component {
	
	private ArrayList<Listener> listeners;
	
	public Button() {
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
	
}
