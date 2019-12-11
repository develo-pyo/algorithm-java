package design_pattern.proxy2;

public class Client {

	public static void main(String[] args) {
		Subject subject = new Proxy();
		System.out.println(subject.action());
	}

}
