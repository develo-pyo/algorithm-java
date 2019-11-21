package design_pattern.observer2;

public interface Component {
	public void addListener(Listener l);
	public void removeListener(Listener l);
	public void notifyListeners();
}
