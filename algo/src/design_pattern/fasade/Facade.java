package design_pattern.fasade;

public class Facade {
	private ValidationService vs;
	private MailService ms;
	private HstService hs;
	
	public Facade(ValidationService vs, MailService ms, HstService hs) {
		this.vs = vs;
		this.ms = ms;
		this.hs = hs;
	}
	
	public void facadeFunc() {
		if(vs.addrChk()) {
			ms.mailSend();
		} 
		hs.hstSave();
	}
}
