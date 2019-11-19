package design_pattern.strategy;

public class Throat {
	
	Shout s;
	
	public void setThroat(Shout s) {
		this.s = s;
	}
	
	public void func1() {
		s.yell();
	}
	
	public void func2() {
		s.scream();
	}
	
}
