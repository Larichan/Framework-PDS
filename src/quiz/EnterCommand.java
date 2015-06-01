package quiz;

import core.Command;

import java.awt.*;
import java.awt.event.KeyEvent;

public class EnterCommand implements Command {

    @Override
    public void execute() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(e -> {
            switch (e.getID()) {
                case KeyEvent.KEY_PRESSED:
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        System.out.println("");
                    }
            }
            return false;
        });
    }

    @Override
    public void advise() {

    }
}
