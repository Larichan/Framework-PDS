package core;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EndScreen extends Screen {

	public EndScreen(String filename, EventMediator m) throws FileNotFoundException, IOException
	{
		super(filename, m);
		super.mediator.register(this);
	}

	@Override
	public void act() {
		super.draw();
		super.mediator.screenDrawed(this);
	}

}