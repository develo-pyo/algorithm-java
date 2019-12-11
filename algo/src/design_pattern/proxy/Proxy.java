package design_pattern.proxy;

public class Proxy implements Subject {
	
	RealSubject realSubject;
	
	public Proxy(){
		realSubject = new RealSubject();
	}

	@Override
	public String action() {
		return realSubject.action();
	}
	
	
	
}
