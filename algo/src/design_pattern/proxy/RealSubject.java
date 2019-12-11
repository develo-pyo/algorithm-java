package design_pattern.proxy;

public class RealSubject implements Subject{

	@Override
	public String action() {
		return "Real Subject action()";
	}

}
