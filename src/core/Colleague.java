package core;

public abstract class Colleague {

	protected final EventMediator mediator;

	public Colleague(EventMediator m) {
		mediator = m;
	}

	public void act() {};

}
