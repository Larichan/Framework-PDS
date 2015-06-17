package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class Screen implements Colleague {

	protected final BufferedReader screen_content;
	protected final EventMediator mediator;

	public Screen(String filename, EventMediator m) throws FileNotFoundException, IOException
	{
		FileReader fr = new FileReader(filename);
		screen_content = new BufferedReader(fr);
		mediator = m;
	}

	public void draw() {
		String line = null;

		try {
			while ((line = screen_content.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}