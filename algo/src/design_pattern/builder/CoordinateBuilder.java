package design_pattern.builder;

public class CoordinateBuilder {
	//빌더 패턴
	//Builder pattern : 텔레스코핑 패턴 + 자바빈 패턴
	//객체는 필수 매개변수를 갖는 생성자로 얻고,
	//나머지 선택필드는 setter 메소드 사용
	//마지막 build 메소드 호출하여 불변 객체 생성
	private final int x;
	private final int y;
	private final int w;
	private final int h;
	
	public static class Builder {
		private final int x;
		private final int y;
		private int w;
		private int h;
		
		public Builder(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Builder w(int w) {
			this.w = w;
			return this;
		}
		
		public Builder h(int h) {
			this.h = h;
			return this;
		}
		
		public CoordinateBuilder build() {
			return new CoordinateBuilder(this);
		}
	}
	
	public CoordinateBuilder(Builder builder) {
		x = builder.x;
		y = builder.y;
		w = builder.w;
		h = builder.h;
	}
	
}
