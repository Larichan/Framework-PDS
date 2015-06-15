package core;

import java.util.ArrayList;

public class MainEventMediator implements EventMediator {

	private static final ArrayList<Colleague> COLLEAGUES = new ArrayList<>();

	public MainEventMediator() {

	}

	@Override
	public void advise(Colleague c) {
		for (Colleague colleague : COLLEAGUES) {
			if (colleague != c) {
				
			}
		}
	}

	@Override
	public void fireTrigger() {
		// TODO Auto-generated method stub

	}

	@Override
	public void register(Colleague c) {
		COLLEAGUES.add(c);
	}

}
