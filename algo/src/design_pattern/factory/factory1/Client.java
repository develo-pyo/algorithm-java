package design_pattern.factory.factory1;

public class Client {

	public static void main(String[] args) {
		ComputerFactory cf = new ComputerFactory();
		cf.createComputer("LG");
	}

}
