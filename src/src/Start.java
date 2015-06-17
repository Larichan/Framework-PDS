

import java.io.IOException;
import java.util.Scanner;

import core.EventMediator;
import core.Screen;
import core.Rule;


public class Start{
	
    public static void main(String[] args) throws IOException {
		MainEventMediator m = new MainEventMediator();
		ScreenFactory factory = new ScreenFactory();
		Screen start_screen = factory.createScreen(1, "start-screen.txt", m);
		Screen end_screen = factory.createScreen(2, "end-screen.txt", m);
		//Screen options_screen = factory.createScreen(3, "options-screen.txt", m);
		Screen quiz_screen = factory.createScreen(4, "guess-questions.txt", m);
		Rule rules = new Ruleset("answers.txt", m);
		GuessScreen a = new GuessScreen("guess-questions.txt", m);
		start_screen.draw();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(n == 1)
		{
			while(true)
			{
				a.act();
				String resposta = input.next();
				m.inputReceived(resposta);
				rules.getChild(a.getLine());
				rules.act();
				m = new MainEventMediator();
				a = new GuessScreen("guess-questions.txt", m);
				rules = new Ruleset("answers.txt", m);
			}
			
		}
		if(n == 2)
		{
			System.exit(0);
		}
		
		input.close();
	}
}
