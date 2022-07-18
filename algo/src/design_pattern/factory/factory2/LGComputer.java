package design_pattern.factory.factory2;

public class LGComputer implements Computer {
	public LGComputer() {
		System.out.println("LG 컴퓨터 생성");
	}
	
	public LGKeyboard createKeyboard() {
		return new LGKeyboard();
	}
	
	public LGMouse createMouse() {
		return new LGMouse();
	}
}
