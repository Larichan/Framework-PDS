package quiz;

import java.io.IOException;
import java.util.Scanner;

import core.EventMediator;
import core.Screen;
import core.ScreenFactory;

public class Start {
	

	public static void main(String[] args) throws IOException {
		EventMediator m = new MainEventMediator();
		ScreenFactory factory = new ScreenFactory();
		Screen start_screen = factory.createScreen(1, "start-screen.txt", m);
		Screen end_screen = factory.createScreen(2, "end-screen.txt", m);
		//Screen options_screen = factory.createScreen(3, "options-screen.txt", m);
		Screen quiz_screen = factory.createScreen(4, "quiz-questions.txt", m);

		start_screen.act();
		Scanner input = new Scanner(System.in);
		input.close();
	}
}
