package core;

import java.io.FileNotFoundException;

public class EndScreen extends Screen {

	public EndScreen(String filename, EventMediator m) throws FileNotFoundException {
		super(filename, m);
		super.mediator.register(this);
	}

	@Override
	public void act() {
		super.draw();
		super.mediator.screenDrawed(this);
	}

}
