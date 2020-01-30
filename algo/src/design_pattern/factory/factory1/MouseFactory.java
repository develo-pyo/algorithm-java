package design_pattern.factory.factory1;

public class MouseFactory {
	public Mouse createMouse(String type) {
		Mouse mouse = null;
		
		switch(type) {
			case "LG":
				mouse = new LGMouse();
				break;
			case "SAMSUNG":
				mouse = new SamsungMouse();
				break;
		}
		
		return mouse;
	}
}
