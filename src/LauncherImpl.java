import java.util.ArrayList;
import states.Classes.ContextImpl;

public class LauncherImpl implements Launcher {

	ArrayList<ContextImpl> games = new ArrayList<ContextImpl>();

	@Override
	public void add(String game) {
		games.add(new ContextImpl(game));
	}

	@Override
	public void install(int id) {
		games.get(id).install();
	}

	@Override
	public void uninstall(int id) {
		games.get(id).uninstall();
	}

	@Override
	public void play(int id) {
		boolean allowed = true;
		for (int i = 0; i < games.size(); i++) {
			ContextImpl game = games.get(i);
			if (game.getState().getId() == 2) {
				if (game != games.get(id)) {
					allowed = false;
					if (games.get(id).getState().getId() == 0) {
						games.get(id).play();
					} else {
						System.out.print("Can't start \"" + games.get(id).getName() + "\" because \"" + game.getName()
								+ "\" is running\n\n");

					}
				}
			}
		}
		if (allowed) {
			games.get(id).play();
		}
	}

	@Override
	public void quit(int id) {
		games.get(id).quit();
	}

	@Override
	public void draw() {
		System.out.print("Available Games\n");
		for (int i = 0; i < games.size(); i++) {
			ContextImpl game = games.get(i);
			System.out.print(i + ". " + game.getName() + "\n");
		}
	}

	@Override
	public void update(int id) {
		games.get(id).update();
	}

}
