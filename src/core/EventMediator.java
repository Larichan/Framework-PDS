package core;

public interface EventMediator {

	public void advise(Colleague c);

	public void fireTrigger();

	public void register(Colleague c);

}
