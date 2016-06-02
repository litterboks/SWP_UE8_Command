import command.Command;

public class UninstallCommand extends Command<Launcher> {

	int gameID;
	
	public UninstallCommand(Launcher object, int gameID) {
		super(object);
		this.gameID = gameID;
	}

	@Override
	public void execute() {
		object.quit(gameID);
	}

	@Override
	public void undo() {
		object.play(gameID);
	}
}
