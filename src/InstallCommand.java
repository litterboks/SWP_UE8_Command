import command.Command;

public class InstallCommand extends Command<Launcher> {

	int gameID;
	
	public InstallCommand(Launcher object, int gameID) {
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
