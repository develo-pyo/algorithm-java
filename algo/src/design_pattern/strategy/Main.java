package design_pattern.strategy;

public class Main {
	public static void main(String args[]) {
		
		Throat throat = new Throat();
		
		throat.setThroat(new Human());
		throat.func1();
		throat.func2();
		
		System.out.println("------------------");
		
		throat.setThroat(new Dog());
		throat.func1();
		throat.func2();
		
	}
}
