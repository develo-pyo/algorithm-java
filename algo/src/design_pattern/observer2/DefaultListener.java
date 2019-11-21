package design_pattern.observer2;

public abstract class DefaultListener implements Listener {
	
	private Component c;
	
	public DefaultListener(Component c) {
		c.addListener(this);
		this.c = c;
	}

	@Override
	public void withdraw() {
		c.removeListener(this);
	}
	
}
