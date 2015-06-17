
import java.io.FileNotFoundException;
import java.io.IOException;

import core.EventMediator;
import core.Screen;
import core.StartScreen;
import core.EndScreen;
import core.OptionsScreen;

public class ScreenFactory {
	public Screen createScreen(int type, String filename, EventMediator m) throws FileNotFoundException, IOException
	{
		if (type == 1) {
			return new StartScreen(filename, m);
		} else if (type == 2) {
			return new EndScreen(filename, m);
		} else if (type == 3) {
			return new OptionsScreen(filename, m);
		} else if (type == 4) {
			return new GuessScreen(filename, m);
		}

		return null;
	}
}