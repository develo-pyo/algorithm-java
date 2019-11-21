package design_pattern.observer;

import java.awt.TextField;
import java.awt.event.ActionListener;

public class Main {

	public static void main(String[] args) {
		
		Button btn = new Button();
		
		Listener customListener1 = new CustomListener1();
		
		Listener customListener2 = new Listener() {
			@Override
			public void performAction() {
				System.out.println("custom listener2 perform action !");
			}
		};
		
		btn.addListener(customListener1);
		btn.addListener(customListener2);
		
		btn.buttonClicked();
		
		System.out.println("----------------------------");
		
		btn.removeListener(customListener2);
		
		System.out.println("----------------------------");
		btn.buttonClicked();
		
	}
	
}
