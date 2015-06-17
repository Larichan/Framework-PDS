package crossword;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import core.EventMediator;
import core.Screen;
import core.Rule;


public class Start{
	
    public static void main(String[] args) throws IOException {
		MainEventMediator m = new MainEventMediator();
		ScreenFactory factory = new ScreenFactory();
		Screen start_screen = factory.createScreen(1, "C:/Users/Larissa/workspace/crossword/start-screen.txt", m);
		Screen end_screen = factory.createScreen(2, "C:/Users/Larissa/workspace/crossword/end-screen.txt", m);
		//Screen options_screen = factory.createScreen(3, "options-screen.txt", m);
		Screen crossword_screen = factory.createScreen(4, "C:/Users/Larissa/workspace/crossword/questions.txt", m);
		Rule rules = new Ruleset("C:/Users/Larissa/workspace/crossword/answers.txt", m);
		CrosswordScreen a = new CrosswordScreen("C:/Users/Larissa/workspace/crossword/questions.txt", m);
		start_screen.draw();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(n == 1)
		{
			a.act();
			String resposta = input.next();
			m.inputReceived(resposta);
			rules.getChild(a.getLine());
			rules.act();
			a.setMainQuestLine(m.getRespostaAtual());
			a.drawMainLines();
			
			while(m.getRespostaAtual().contains("-"))
			{
				resposta = input.next();
				if(m.getRespostaCerta().contains(resposta)){
					
					System.out.println("Acertou a letra!");
					char letraJogador[] = resposta.toCharArray();
					char letraRespostaAtual[] = m.getRespostaAtual().toCharArray();
					char letraRespostaCerta[] = m.getRespostaCerta().toCharArray();
					
					for(int i=0; i<m.getRespostaCerta().length(); i++){
						if(letraRespostaCerta[i] == letraJogador[0]){
							letraRespostaAtual[i] = letraJogador[0];
						}
					}
					m.setRespostaAtual(String.valueOf(letraRespostaAtual));
				}
				a.setMainQuestLine(m.getRespostaAtual());
				a.drawMainLines();
			}

			System.out.println("Parabéns! Você venceu!");
			
		}
		if(n == 2)
		{
			System.exit(0);
		}
		
		input.close();
	}
}
