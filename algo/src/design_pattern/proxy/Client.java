package design_pattern.proxy;

public class Client {

	public static void main(String[] args) {
		Subject subject = new Proxy();
		System.out.println(subject.action());
	}

}
