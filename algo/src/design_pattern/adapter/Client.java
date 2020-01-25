package design_pattern.adapter;

public class Client {
	public static void main(String[] args) {
		OldLibraryIF adapter = new Adapter();
		adapter.sendPush("message");
	}
}
