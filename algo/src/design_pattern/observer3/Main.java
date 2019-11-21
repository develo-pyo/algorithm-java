package design_pattern.observer3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subject s = new Subject();
		ObserverImpl o = new ObserverImpl(s);
		s.addObserver(o);
		s.setTmp("???");
		
		s.setTmp("kkk");
		
		s.setTmp("ttt");
	}

}
