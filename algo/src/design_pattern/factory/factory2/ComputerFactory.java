package design_pattern.factory.factory2;

public class ComputerFactory  {
	
	 public void createComputer(Computer computer){
        computer.createKeyboard();
        computer.createMouse();
    }
	
}
