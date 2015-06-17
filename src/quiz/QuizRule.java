package quiz;

import core.Command;
import core.EventMediator;
import core.Rule;

public class QuizRule extends Rule {

	private Command command;

	public QuizRule(Command c, EventMediator m) {
		super(m);
		command = c;
	}
	
	@Override
	public void checkRule() {
		
	}
}
