package design_pattern.proxy2;

public class Proxy implements Subject {
	
	RealSubject realSubject;
	
	@Override
	public String action() {
		if(realSubject == null) {
			realSubject = new RealSubject();
		}
		return realSubject.action();
	}
}
