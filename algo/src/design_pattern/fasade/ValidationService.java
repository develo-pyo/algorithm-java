package design_pattern.fasade;

public class ValidationService {
	
	String mailAddr = "";
	
	public ValidationService(String addr){
		this.mailAddr = addr;
	}
	
	public boolean addrChk() {
		if(!mailAddr.isEmpty()) {
			System.out.println("mail validation check success!");
			return true;
		}
		return false;
	}
	
}
