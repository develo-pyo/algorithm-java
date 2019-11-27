package design_pattern.factory;

import java.net.URL;
import java.net.URLConnection;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		URL h = new URL("test");
		
		URLConnection c = h.openConnection();
		c.getInputStream();
		
		
	}
}
