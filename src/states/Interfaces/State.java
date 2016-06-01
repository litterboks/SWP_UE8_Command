package states.Interfaces;

public interface State {
	
	int getId();
	
	void install();

	void uninstall();

	void play();

	void quit();
	
	void update();
}
