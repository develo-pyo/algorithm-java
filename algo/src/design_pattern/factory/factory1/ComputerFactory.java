package design_pattern.factory.factory1;

public class ComputerFactory {
	public void createComputer(String type) {
		KeyboardFactory keyboardFactory = new KeyboardFactory();
		MouseFactory mouseFactory = new MouseFactory();
		
		keyboardFactory.createKeyboard(type);
		mouseFactory.createMouse(type);
	}
}
