
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import core.EventMediator;
import core.Rule;

public class Ruleset implements Rule
{
	protected final BufferedReader screen_content;
	protected final MainEventMediator mediator;
	protected String respost;
	public boolean bool;
	protected int whichLine;
	
	public Ruleset(String filename, MainEventMediator m) throws FileNotFoundException, IOException
	{
		FileReader fr = new FileReader(filename);
		screen_content = new BufferedReader(fr);
		mediator = m;
	}
	
	public void setLine(int n)
	{
		whichLine = n;
	}
	
	@Override
	public void checkRule()
	{
		//aqui eu defino o bool
		String toCompare = mediator.inputGiven();
		if(respost.equals(toCompare))
			bool = true;
		else
			bool = false;
	}
	
	@Override
	public void getChild(int n) {
		//String line = null;

		try {
			for(int i = 0; i < n - 1; i++)
			{
				screen_content.readLine();
			}
			respost = screen_content.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void add()
	{
		
	}
	
	public void remove()
	{
		
	}
	
	public void act()
	{
		checkRule();
		mediator.ruleChecked(this, bool);
	}

}
