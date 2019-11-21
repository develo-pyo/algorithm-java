package design_pattern.observer;

public class Main {

	public static void main(String[] args) {
		
		Button btn = new Button();
		
		Listener defaultListener = new EventListener();
		Listener customListener = new Listener() {
			@Override
			public void performAction() {
				System.out.println("custom action !");
			}
		};
		btn.addListener(defaultListener);
		btn.addListener(customListener);
		btn.notifyListeners();
		
		System.out.println("----------------------------");
		btn.removeListener(customListener);
		
		System.out.println("----------------------------");
		btn.notifyListeners();
	}
	
}
