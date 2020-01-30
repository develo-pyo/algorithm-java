package design_pattern.factory.factory3;

public class Factory {
	public static Mouse createMouse(String type) {
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
