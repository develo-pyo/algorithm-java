package design_pattern.builder;

public class CoordinateTelescoping {

   //Telescoping constructor
	private final int x;
	private final int y;
	private int w;
	private int h;
	
	public CoordinateTelescoping(int x, int y) {
		this(x, y, 0, 0);
	}
	public CoordinateTelescoping(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
}
