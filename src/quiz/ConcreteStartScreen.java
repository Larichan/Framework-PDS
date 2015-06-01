package quiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import core.StartScreen;

public class ConcreteStartScreen extends StartScreen {

	private BufferedReader screenContent;
	
	public ConcreteStartScreen() throws FileNotFoundException {
		screenContent = new BufferedReader(new FileReader("start-screen.in"));
	}

	@Override
	public void draw() throws IOException {
		String line;
		while ((line = screenContent.readLine()) != null) {
			System.out.println(line);
		}
	}

	@Override
	public void advise() {
	}

}
