package design_pattern.proxy3_aop;

public class Proxy implements Subject {
	
	RealSubject realSubject;
	
	@Override
	public Object action() {
		if(realSubject == null) {
			realSubject = new RealSubject();
		}
		
		preProcess();
		Object result = realSubject.action();
		postProcess();
		
		return result;
	}
	
	private void preProcess() {
		System.out.println("전처리");
	}
	
	private void postProcess() {
		System.out.println("후처리");
	}
}
