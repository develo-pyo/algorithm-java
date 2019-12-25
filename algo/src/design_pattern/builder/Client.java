package design_pattern.builder;

public class Client {

	public static void main(String[] args) {
		
		//1. 텔레스코핑
		CoordinateTelescoping c1 = new CoordinateTelescoping(10, 10, 0, 0);

		//2. 자바빈
		CoordinateJavaBean c2 = new CoordinateJavaBean();
		c2.setX(100);
		
		//3. 빌더
		//객체는 필수 매개변수를 갖는 생성자로 얻고,
		//나머지 선택필드는 setter 메소드 사용
		CoordinateBuilder c3 = new CoordinateBuilder.Builder(1000, 1000).w(100).h(100).build();
		
	}
}
