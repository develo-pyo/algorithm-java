package design_pattern.builder;

public class CoordinateTelescoping {
	//텔레스코핑 생성자 패턴
	//Telescoping constructor
	//단점 :
	//필수 선택 필드를 무조건 넘겨야 한다는 문제
	//매개변수 증가시 코드 무거워지는 문제
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
