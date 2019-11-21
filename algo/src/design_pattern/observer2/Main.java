package design_pattern.observer2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Button btn = new Button();
		
		Listener customListener1 = new CustomListener1(btn);
		Listener customListener2 = new DefaultListener(btn) {
			@Override
			public void performAction() {
				System.out.println("custom listener2 perform action !");
			}
		};
		
//		btn.addListener(customListener1);
//		btn.addListener(customListener2);
		btn.notifyListeners();
		
		
		System.out.println("----------------------------");
		
//		customListener2.withdraw();
//		btn.removeListener(customListener2);
		
		System.out.println("----------------------------");
		btn.notifyListeners();
		
		
		List<String> a = new ArrayList<String>();
		
	}
}
