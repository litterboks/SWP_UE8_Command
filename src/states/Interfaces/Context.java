package states.Interfaces;

public interface Context {

	void changeState(State state);

	void install();

	void uninstall();

	void play();

	void quit();
	
	void update();
	
	State getState();
}
