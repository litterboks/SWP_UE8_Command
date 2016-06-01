package states.Classes;

public class Updating extends StateImpl {

	ContextImpl context;
	int counter = 0;

	Updating(ContextImpl context) {
		this.context = context;
	}

	@Override
	public void install() {
		if (counter < 2) {
			counter++;
			System.out.print(context.getName() + " is already installed and currently updating..\n\n");
		} else {
			context.changeState(new Installed(context));
			context.install();
		}
	}

	@Override
	public void uninstall() {
		if (counter < 2) {
			counter++;
			System.out.print("Currently updating " + context.getName() + ", please wait..\n\n");
		} else {
			context.changeState(new Installed(context));
			context.uninstall();
		}
	}

	@Override
	public void play() {
		if (counter < 2) {
			counter++;
			System.out.print("Currently updating " + context.getName() + ", please wait..\n\n");
		} else {
			context.changeState(new Installed(context));
			context.play();
		}
	}

	@Override
	public void quit() {
		if(counter < 2){
		counter++;
		System.out.print(context.getName() + " is currently not running.\n\n");
		}
		else{
			context.changeState(new Installed(context));
			context.quit();
		}
	}

	@Override
	public void update() {
		if (counter < 2) {
			counter++;
			System.out.print(context.getName() + " is currently updating..\n\n");
		} else {
			System.out.print(context.getName() + " is up-to-date.\n\n");
			context.changeState(new Installed(context));
		}
	}

	@Override
	public int getId() {
		return 3;
	}

}
