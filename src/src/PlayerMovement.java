package src;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class PlayerMovement implements KeyListener {
    private Spaceship player;

    public PlayerMovement(Spaceship player) {
        this.player = player;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                this.player.move(1);
                break;
            case KeyEvent.VK_LEFT:
                this.player.move(2);
                break;
            case KeyEvent.VK_UP:
                this.player.move(3);
                break;

            case KeyEvent.VK_DOWN:
                this.player.move(4);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
