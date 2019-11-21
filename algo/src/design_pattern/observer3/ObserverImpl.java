package design_pattern.observer3;

import java.util.Observable;
import java.util.Observer;

public class ObserverImpl implements Observer {

	Observable observable;
	
	ObserverImpl(Observable ob){
		this.observable = ob;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Subject) {
			Subject s = (Subject)o;
			System.out.println(s.getTmp());
			
		}
	}
	
	
}
