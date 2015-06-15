package core;

import java.io.FileNotFoundException;

public class StartScreen extends Screen {

	public StartScreen(String filename, EventMediator m) throws FileNotFoundException {
		super(filename, m);
	}

	@Override
	public void act() {
		super.draw();
		super.mediator.advise(this);
	}

}
