package design_pattern.factory.factory1;

public class KeyboardFactory {
	public Keyboard createKeyboard(String type) {
		Keyboard keyboard = null;
		
		switch(type) {
			case "LG":
				keyboard = new LGKeyboard();
				break;
			case "SAMSUNG":
				keyboard = new SamsungKeyboard();
				break;
		}
		
		return keyboard;
	}
}
