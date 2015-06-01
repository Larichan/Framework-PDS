package core;

import quiz.ConcreteStartScreen;

import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {
        StartScreen start_screen = new ConcreteStartScreen();
        start_screen.draw();
    }
}
