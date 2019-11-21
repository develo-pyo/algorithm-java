package design_pattern.observer3;

import java.util.Observable;
import java.util.Observer;

public class Subject extends Observable{
	
	String tmp;
	
	
	@Override
	public synchronized void addObserver(Observer o) {
		// TODO Auto-generated method stub
		super.addObserver(o);
	}
	
	public void setTmp(String tmp) {
		this.tmp = tmp;
		setChanged();
		notifyObservers();
	}
	
	public String getTmp() {
		return tmp;
	}
	
	
	
}
