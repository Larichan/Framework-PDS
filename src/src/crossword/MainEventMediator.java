package crossword;


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
	private String respostaAtual = null;
	private String respost;

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
				if (c instanceof CrosswordScreen) {
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
			System.out.println("Acertou a letra!");
		else
			System.out.println("Errou a letra...");
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
	
	public void setRespostaAtual(String respostaAtual){
		this.respostaAtual = respostaAtual;
	}
	
	public String getRespostaAtual (){
		return respostaAtual;
	}
	
	public void respostaAtual(Screen s) {
		if (s instanceof StartScreen) {
			for (Colleague c : COLLEAGUES) {
				if (c instanceof CrosswordScreen) {
					((CrosswordScreen) c).setMainQuestLine(respostaAtual);
					((CrosswordScreen) c).drawMainLines();
				}
			}
		}
	}

	public void setRespostaCerta(String respost) {
		// TODO Auto-generated method stub
		this.respost = respost;
	}
	
	public String getRespostaCerta(){
		return respost;
	}
}