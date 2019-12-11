package design_pattern.proxy2;

public class RealSubject implements Subject{

	@Override
	public String action() {
		return "Real Subject action()";
	}

}
