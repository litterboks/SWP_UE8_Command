package states.Classes;

public class Playing extends StateImpl {

	ContextImpl context;

	Playing(ContextImpl context) {
		this.context = context;
	}

	@Override
	public void install() {
		System.out.print(context.getName() + " is already installed and running.\n\n");
	}

	@Override
	public void uninstall() {
		System.out.print("Please quit " + context.getName() + " before uninstalling.\n\n");
	}

	@Override
	public void play() {
		System.out.print("Currently playing " + context.getName() + "\n\n");
	}

	@Override
	public void quit() {
		System.out.print("Shutting down " + context.getName() + "\n\n");
		context.changeState(new Installed(context));
	}

	@Override
	public void update() {
		System.out.print("Please quit " + context.getName() + " before updating.\n\n");
	}

	@Override
	public int getId() {
		return 2;
	}
}
