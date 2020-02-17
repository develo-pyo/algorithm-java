package sample;

public class Pibona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1 1 2 3 5 8
//		a b c
//		  a b c
//		    a b c
		int a = 1;
		int b = 1;
		int c = a+b;
		
		for(int i=0; i<7; i++) {
			
			
			System.out.println(a);
			c = a+b;
			a = b;
			b = c;
		}
		
		
	}
		
}
