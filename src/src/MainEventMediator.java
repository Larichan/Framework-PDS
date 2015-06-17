
import java.util.ArrayList;

import core.Colleague;
import core.EndScreen;
import core.EventMediator;
import core.OptionsScreen;
import core.Rule;
import core.Screen;
import core.StartScreen;

public class MainEventMediator implements EventMediator {

	private ArrayList<Colleague> COLLEAGUES;
	private String input;

	public MainEventMediator() {
		COLLEAGUES = new ArrayList<>();
	}

	@Override
	public void inputReceived(String c) {
		// TODO Auto-generated method stub
		input = c;
	}
	
	public String inputGiven()
	{
		return input;
	}
	
	
	@Override
	public void screenDrawed(Screen s) {
		if (s instanceof StartScreen) {
			for (Colleague c : COLLEAGUES) {
				if (c instanceof GuessScreen) {
					c.act();
				}
			}
		}
	}

	@Override
	public void ruleChecked(Rule r, boolean b) {
		// TODO Auto-generated method stub
		if (r instanceof Rule) {
			for (Colleague c : COLLEAGUES) {
				if (c instanceof Ruleset)
				{
					c.act();
				}
			}
		}
		if(b == true)
			System.out.println("Acertou!");
		else
			System.out.println("Errou...");
	}
	
	@Override
	public void register(Colleague c) {
		COLLEAGUES.add(c);
	}

	public int compareScreen(Screen s) {
		if (s instanceof StartScreen) {
			return 1;
		} else if (s instanceof EndScreen) {
			return 2;
		} else if (s instanceof OptionsScreen) {
			return 3;
		} else {
			return 0;
		}
	}
}