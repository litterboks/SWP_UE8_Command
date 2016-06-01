public interface Launcher {

	void add(String game);

	void install(int id);

	void uninstall(int id);

	void play(int id);

	void update(int id);

	void quit(int id);

	void draw();

}
