package design_pattern.strategy;

public class Human implements Shout{
	
	@Override
	public void yell() {
		System.out.println("À¸¾Ç");
	}

	@Override
	public void scream() {
		System.out.println("²¥");
	}
	
}
