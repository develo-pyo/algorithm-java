package design_pattern.adapter;

public class OldLibrary implements OldLibraryIF {
	
	public void sendPush(String input) {
		System.out.println("send " + input + " using OldLibrary");
	}
	
}
