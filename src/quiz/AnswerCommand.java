package quiz;

import java.util.Scanner;

import core.Command;
import core.EventMediator;
import core.Screen;

public class AnswerCommand extends Command {

	private int response;
	private Screen quiz_screen;

	public AnswerCommand(Screen q, EventMediator m) {
		super(m);
		super.mediator.register(this);
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
