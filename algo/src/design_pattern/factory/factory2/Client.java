package design_pattern.factory.factory2;

public class Client {
	public static void main(String[] args) {
		ComputerFactory cf = new ComputerFactory();
		cf.createComputer(new SamsungComputer());
		cf.createComputer(new LGComputer());
	}
}
