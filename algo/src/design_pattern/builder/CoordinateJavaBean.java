package design_pattern.builder;

public class CoordinateJavaBean {
	//자바 빈 패턴
	//java bean pattern
	
	//장점 : 객체 생성이 간단하며 가독성이 좋음
	//단점 : 코드가 김
	//치명적인 단점 : 객체가 완전하게 생성되었는지 보장 불가(동결(freezing) 보장 불가)
	//  ex : x, y 값 없이 w, h 값만 가지고도 객체 생성 가능
	
	private int x=0;
	private int y=0;
	private int w=0;
	private int h=0;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setW(int w) {
		this.w = w;
	}
	public void setH(int h) {
		this.h = h;
	}
	
}
