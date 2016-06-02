import command.Command;

public class UpdateCommand extends Command<Launcher> {

	int gameID;
	
	public UpdateCommand(Launcher object, int gameID) {
		super(object);
		this.gameID = gameID;
	}

	@Override
	public void execute() {
		object.update(gameID);
	}

	@Override
	public void undo() {
		object.quit(gameID);
	}
}
