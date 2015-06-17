package quiz;

import java.util.Scanner;

import core.Command;
import core.EventMediator;

public class AnswerCommand extends Command {

	private int response;
	private QuizScreen quiz_screen;

	public AnswerCommand(QuizScreen q, EventMediator m) {
		super(m);
		quiz_screen = q;
	}

	@Override
	public void act() {
		execute();
		super.mediator.commandReceived(this);
	}

	@Override
	public void execute() {
		Scanner user_input = new Scanner(System.in);
		response = user_input.nextInt();
		user_input.close();
	}

}
