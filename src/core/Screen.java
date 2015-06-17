package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class Screen extends Colleague {

	protected final BufferedReader screen_content;

	public Screen(String filename, EventMediator m)
			throws FileNotFoundException {
		super(m);
		screen_content = new BufferedReader(new FileReader(filename));
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
