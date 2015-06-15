package core;

import java.io.IOException;

public class Start {

	public static void main(String[] args) throws IOException {
		final MainEventMediator main_mediator = new MainEventMediator();
		final StartScreen start_screen = new StartScreen("start-screen.txt", main_mediator);
		//final EndScreen end_screen = new EndScreen("end-screen.txt", main_mediator);
		//final OptionsScreen options_screen = new OptionsScreen("options-screen.txt", main_mediator);

		start_screen.act();

	}
}
