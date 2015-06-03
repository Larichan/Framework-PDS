package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StartScreen implements Screen {
	private BufferedReader screen_content;
	
	public StartScreen() {
		try {
			screen_content = new BufferedReader(new FileReader("start-screen.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public void advise() {
		// TODO Auto-generated method stub
	}

	@Override
	public void draw() throws IOException {
		// TODO Auto-generated method stub
	}
}
