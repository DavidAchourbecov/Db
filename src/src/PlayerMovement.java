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
                    if (this.player.getBody().getX()<Constants.WINDOW_WIDTH-Constants.SPACESHIP_WIDTH){
                        this.player.move(Constants.MOVE_RIGHT);
                    }

                  //  this.enemy.move(Constants.MOVE_RIGHT);
                    break;
                case KeyEvent.VK_LEFT:
                    if (this.player.getBody().getX()>=Constants.END_FRAME){
                        this.player.move(Constants.MOVE_LEFT);
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (this.player.getBody().getY()-Constants.SPACESHIP_HEIGHT>=Constants.END_FRAME)
                    this.player.move(Constants.MOVE_UP);

                    break;

                case KeyEvent.VK_DOWN:
                    if(this.player.getBody().getY()<=Constants.WINDOW_HEIGHT-Constants.SPACESHIP_HEIGHT){
                        this.player.move(Constants.MOVE_DOWN);
                    }
                    break;
                    //this.enemy.move(Constants.MOVE_DOWN);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

    }

