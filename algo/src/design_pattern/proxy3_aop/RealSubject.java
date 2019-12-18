package design_pattern.proxy3_aop;

public class RealSubject implements Subject{

	@Override
	public Object action() {
		return "action called";
	}

}
