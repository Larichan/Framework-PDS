package quiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import core.EventMediator;
import core.Screen;

public class QuizScreen extends Screen {

	private static int actualLine;
	private static final int totalLines = 3;

	public QuizScreen(String filename, EventMediator m)
			throws FileNotFoundException {
		super(filename, m);
		super.mediator.register(this);
		actualLine = 0;
	}

	@Override
	public void act() {
		draw();
		super.mediator.screenDrawed(this);
	}

	@Override
	public void draw() {
		BufferedReader br = super.screen_content;

		Random r = new Random();
		int lineNumber = r.nextInt(totalLines) + 1;
		String line = null;
		for (int i = 0; i < lineNumber; ++i) {
			try {
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		actualLine = lineNumber;
		System.out.println(line);
	}
}
