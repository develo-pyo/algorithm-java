package design_pattern.observer;

public interface Component {
	public void addListener(Listener l);
	public void removeListener(Listener l);
	public void notifyListeners();
}
