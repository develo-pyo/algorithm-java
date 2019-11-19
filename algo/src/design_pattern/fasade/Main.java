package design_pattern.fasade;

public class Main {
	
	public static void main(String args[]) {
		Facade f = new Facade(new ValidationService("receiver@gmail.com")
							, new MailService()
							, new HstService());
		f.facadeFunc();
	}
	
}
