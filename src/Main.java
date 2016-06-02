import java.util.InputMismatchException;
import java.util.Scanner;

import command.Command;

public class Main {

	public static void main(final String[] args) {
		Launcher launcher = new LauncherImpl();
		launcher.add("Charted 4");
		launcher.add("Nevil May Die");
		launcher.add("Pickaxe Knight");
		launcher.add("Bright Souls 3");
		launcher.add("Rocket League of Extraordinary Gentlemen");
		
		int gameId = 0;
		Scanner reader = new Scanner(System.in);

		while (gameId != -1) {
			launcher.draw();
			System.out.print("\nChoose a game or quit (-1):\n");

			try {
				gameId = reader.nextInt();
			} catch (InputMismatchException e) {
				gameId = -1;
				System.out.print("Forbidden action.. launcher closing..\n");
				break;
			}
			if (gameId != -1) {
				System.out.print("\n 1 Install\n 2.Play\n 3.Quit\n 4.Update\n 5.Uninstall\n");
				System.out.print("Choose an action:\n");
				int actionId = 0;
				try {
					actionId = reader.nextInt();
				} catch (InputMismatchException e) {

				}

				System.out.print("\n");

				switch (actionId) {
				case 1:
					Command<Launcher> install = new InstallCommand(launcher, gameId);
					install.execute();
					break;
				case 2:
					Command<Launcher> play = new PlayCommand(launcher, gameId);
					play.execute();
					break;
				case 3:
					Command<Launcher> quit = new PlayCommand(launcher, gameId);
					quit.undo();
				case 4:
					Command<Launcher> update = new UpdateCommand(launcher, gameId);
					update.execute();
					break;
				case 5:
					Command<Launcher> uninstall = new InstallCommand(launcher, gameId);
					uninstall.undo();
				}
			}
		}
		System.out.print("Goodbye!");
		reader.close();
	}
}
