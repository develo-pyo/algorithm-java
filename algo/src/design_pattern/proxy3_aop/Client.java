package design_pattern.proxy3_aop;

public class Client {

	public static void main(String[] args) {
		Subject subject = new Proxy();
		System.out.println(subject.action());
	}

}
