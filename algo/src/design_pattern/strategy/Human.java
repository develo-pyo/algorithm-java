package design_pattern.strategy;

public class Human implements Shout{
	
	@Override
	public void yell() {
		System.out.println("으악");
	}

	@Override
	public void scream() {
		System.out.println("꺄");
	}
	
}
