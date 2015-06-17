package quiz;

import java.util.ArrayList;

import core.Colleague;
import core.Command;
import core.EndScreen;
import core.EventMediator;
import core.OptionsScreen;
import core.Rule;
import core.Screen;
import core.StartScreen;

public class MainEventMediator implements EventMediator {

	private ArrayList<Colleague> COLLEAGUES;

	public MainEventMediator() {
		COLLEAGUES = new ArrayList<>();
	}

	@Override
	public void commandReceived(Command c) {
		if (c instanceof AnswerCommand) {
			answerCommandNotification();
		}
	}

	@Override
	public void screenDrawed(Screen s) {
		if (s instanceof StartScreen) {
			startScreenNotification();
		} else if (s instanceof QuizScreen) {
			quizScreenNotification();
		}
	}

	@Override
	public void ruleChecked(Rule r, boolean b) {
		// TODO Auto-generated method stub
	}

	@Override
	public void register(Colleague c) {
		COLLEAGUES.add(c);
	}

	public void answerCommandNotification() {
		for (Colleague c : COLLEAGUES) {
			if (c instanceof Rule) {
				c.act();
			}
		}
	}

	public void quizScreenNotification() {
		for (Colleague c : COLLEAGUES) {
			if (c instanceof Command) {
				c.act();
			}
		}
	}

	public void startScreenNotification() {
		for (Colleague c : COLLEAGUES) {
			if (c instanceof QuizScreen) {
				c.act();
			}
		}
	}

}
