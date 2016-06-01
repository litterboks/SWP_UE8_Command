package states.Classes;

import java.util.concurrent.TimeUnit;

public class Uninstalled extends StateImpl {

	ContextImpl context;

	Uninstalled(ContextImpl context) {
		this.context = context;
	}

	@Override
	public void install() {
		System.out.print("Installing " + context.getName()+"\n\n");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		context.changeState(new Installed(this.context));
	}

	@Override
	public void uninstall() {
		System.out.print(context.getName() + " is not installed.\n\n");

	}

	@Override
	public void play() {
		System.out.print(context.getName() + " is not installed.\n\n");
	}

	@Override
	public void update() {
		System.out.print(context.getName() + " is not installed.\n\n");
	}
	
	@Override
	public void quit(){
		System.out.print(context.getName() + " is not installed.\n\n");
	}

	@Override
	public int getId() {
		return 0;
	}

}
