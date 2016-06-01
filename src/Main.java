import java.util.InputMismatchException;
import java.util.Scanner;

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
					launcher.install(gameId);
					break;
				case 2:
					launcher.play(gameId);
					break;
				case 3:
					launcher.quit(gameId);
					break;
				case 4:
					launcher.update(gameId);
					break;
				case 5:
					launcher.uninstall(gameId);
				}
			}
		}
		System.out.print("Goodbye!");
		reader.close();
	}
}
