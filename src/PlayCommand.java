import command.Command;

public class PlayCommand extends Command<Launcher> {

	int gameID;
	
	public PlayCommand(Launcher object, int gameID) {
		super(object);
		this.gameID = gameID;
	}

	@Override
	public void execute() {
		object.play(gameID);
	}

	@Override
	public void undo() {
		object.quit(gameID);
	}
}
