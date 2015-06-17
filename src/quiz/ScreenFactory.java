package quiz;

import java.io.FileNotFoundException;

import core.EndScreen;
import core.EventMediator;
import core.OptionsScreen;
import core.Screen;
import core.StartScreen;

public class ScreenFactory {
	public Screen createScreen(int type, String filename, EventMediator m)
			throws FileNotFoundException {
		if (type == 1) {
			return new StartScreen(filename, m);
		} else if (type == 2) {
			return new EndScreen(filename, m);
		} else if (type == 3) {
			return new OptionsScreen(filename, m);
		} else if (type == 4) {
			return new QuizScreen(filename, m);
		}

		return null;
	}
}
