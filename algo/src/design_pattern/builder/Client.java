package design_pattern.builder;

public class Client {

	public static void main(String[] args) {
		
		//1. 텔레스코핑 방식 : 생성자, 오버로딩 사용
	   //몸통이 너무 커지는 문제
		CoordinateTelescoping c1 = new CoordinateTelescoping(10, 10, 0, 0);

		//2. 자바빈 방식 : setter 사용
		//null 문제
		CoordinateJavaBean c2 = new CoordinateJavaBean();
		c2.setX(100);
		
		//3. 텔레스코핑 + 자바빈 방식이 합쳐진 builder 패턴
		CoordinateBuilder c3 = new CoordinateBuilder.Builder(1000, 1000).w(100).h(100).build();
		
	}
}
