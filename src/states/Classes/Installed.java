package states.Classes;

public class Installed extends StateImpl {

	ContextImpl context;

	Installed(ContextImpl context) {
		this.context = context;
	}

	@Override
	public void install() {
		System.out.print(context.getName() + " already Installed");
	}

	@Override
	public void uninstall() {
		System.out.print("Uninstalling " + context.getName() + "\n\n");
		this.context.changeState(new Uninstalled(this.context));
	}

	@Override
	public void play() {
		System.out.print("Starting " + context.getName() + "\n\n");
		context.changeState(new Playing(context));
	}

	@Override
	public void quit() {
		System.out.print(context.getName() + " currently not running..\n\n");
	}

	@Override
	public void update() {
		System.out.print("Updating " + context.getName() + "\n\n");
		context.changeState(new Updating(context));
	}

	@Override
	public int getId() {
		return 1;
	}

}