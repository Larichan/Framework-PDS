package core;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StartScreen extends Screen {

	public StartScreen(String filename, EventMediator m) throws FileNotFoundException, IOException
	{
		super(filename, m);
		super.mediator.register(this);
	}

	@Override
	public void act() {
		super.draw();
		//super.mediator.screenDrawed(this);
	}

}