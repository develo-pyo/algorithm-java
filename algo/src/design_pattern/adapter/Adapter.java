package design_pattern.adapter;

public class Adapter implements OldLibraryIF{
	
	NewLibraryIF newLibrary = new NewLibrary();

	@Override
	public void sendPush(String input) {
		newLibrary.sendMsg(input);
	}
	
}
