package states.Classes;

import states.Interfaces.State;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class StateImpl implements State {

	@Override
	public void install() {
		throw new NotImplementedException();
	}

	@Override
	public void uninstall() {
		throw new NotImplementedException();
	}

	@Override
	public void play() {
		throw new NotImplementedException();
	}

	public void quit() {
		throw new NotImplementedException();
	}

	@Override
	public void update() {
		throw new NotImplementedException();
	}

}
