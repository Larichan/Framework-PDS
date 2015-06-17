package core;

public abstract class Command extends Colleague {
	public Command(EventMediator m) {
		super(m);
	}

	public void execute() {};
}
