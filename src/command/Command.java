package command;

public abstract class Command<T> {
	protected T object;

	public Command(T object) {
		this.object = object;
	}

	public abstract void execute();
	public abstract void undo();
	
	public Object getObject() {
		return object;
	}

}
