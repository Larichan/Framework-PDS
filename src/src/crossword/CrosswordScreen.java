package crossword;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import core.EventMediator;
import core.Screen;

public class CrosswordScreen extends Screen {

	private static int actualLine;
	private static final int totalLines = 14;
	private static String mainTipLine = null;
	private static String mainQuestLine = null;

	public CrosswordScreen(String filename, EventMediator m) throws FileNotFoundException, IOException
	{
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
		int lineNumber = r.nextInt(totalLines) + 2;
		String tipLine = null;
		String questionLine = null;
		for (int i = 0; i < lineNumber; ++i) {
			try {
				tipLine = br.readLine();
				i++;
				questionLine = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		lineNumber++;
		lineNumber /= 2;
		actualLine = lineNumber;
		mainTipLine = tipLine;
		mainQuestLine = questionLine;
		System.out.println(tipLine);
		System.out.println(questionLine);
	}
	
	public static int getLine()
	{
		return actualLine;
	}
	
	public static void drawMainLines(){
		System.out.println(mainQuestLine);
	}
	
	public static void setMainQuestLine(String mainQuestLine){
		CrosswordScreen.mainQuestLine = mainQuestLine;
	}
}