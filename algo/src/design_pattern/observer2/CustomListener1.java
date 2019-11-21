package design_pattern.observer2;

public class CustomListener1 extends DefaultListener {
	
	public CustomListener1(Component c) {
		super(c);
	}

	@Override
	public void performAction() {
		System.out.println("custom listener1 perform action !");
	}

}
