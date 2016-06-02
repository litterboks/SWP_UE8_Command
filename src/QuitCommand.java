import command.Command;

public class QuitCommand extends Command<Launcher> {

	int gameID;
	
	public QuitCommand(Launcher object, int gameID) {
		super(object);
		this.gameID = gameID;
	}

	@Override
	public void execute() {
		object.install(gameID);
	}

	@Override
	public void undo() {
		object.uninstall(gameID);
	}
}
