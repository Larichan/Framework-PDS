package core;

import java.io.FileNotFoundException;

public class OptionsScreen extends Screen {

	public OptionsScreen(String filename, EventMediator m) throws FileNotFoundException {
		super(filename, m);
		super.mediator.register(this);
	}

	@Override
	public void act() {
		super.draw();
		super.mediator.screenDrawed(this);
	}

}
