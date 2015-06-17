package core;

public interface EventMediator {

	public void screenDrawed(Screen s);

	public void commandReceived(Command c);

	public void ruleChecked(Rule r, boolean b);

	public void register(Colleague c);

}
