package core;

public abstract class Rule extends Colleague {
	public Rule(EventMediator m) {
		super(m);
	}

	public void add(Rule r) {
	};

	public void checkRule() {
	};

	public void getChild(int n) {
	};

	public void remove(int n) {
	};

	public void remove(Rule r) {
	};

}
