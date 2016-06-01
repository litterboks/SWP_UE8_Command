package states.Classes;

import states.Interfaces.Context;
import states.Interfaces.State;

public class ContextImpl implements Context {

	private State state;
	private String name;
	
	public ContextImpl(String name) {
		this.state = new Uninstalled(this);
		this.setName(name);
	}

	@Override
	public void changeState(State state) {
		this.state = state;
	}

	@Override
	public void install() {
		this.state.install();
	}

	@Override
	public void uninstall() {
		this.state.uninstall();
	}

	@Override
	public void play() {
		this.state.play();
	}
	
	@Override
	public void quit() {
		this.state.quit();
	}

	@Override
	public void update() {
		this.state.update();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public State getState() {
		return state;
	}

}
