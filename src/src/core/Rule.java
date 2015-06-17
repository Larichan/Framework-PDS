package core;

public interface Rule extends Colleague {
	public void add();

	public void checkRule();

	public void getChild(int n);

	public void remove();
}