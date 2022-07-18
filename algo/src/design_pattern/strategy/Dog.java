package design_pattern.strategy;

public class Dog implements Shout{

	@Override
	public void yell() {
		System.out.println("멍");
	}

	@Override
	public void scream() {
		System.out.println("멍멍");
	}
	
}
