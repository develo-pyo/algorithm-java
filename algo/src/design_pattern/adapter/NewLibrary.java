package design_pattern.adapter;

public class NewLibrary implements NewLibraryIF {
	
	public void sendMsg(String input) {
		System.out.println("send " + input + " using NewLibrary");
	}
	
}
