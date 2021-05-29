package src;

import javax.swing.*;
import java.awt.*;


public class Game extends JFrame {

    private Spaceship player;

    public static void main(String[] args) {
       Game game = new Game();


        }
    public Game(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,700);
        this.setLayout(null);
        this.setTitle("Game");
        this.setResizable(false);
        this.player=new Spaceship();
        PlayerMovement playerMovement = new PlayerMovement(this.player);
        this.addKeyListener(playerMovement);
        mainGameLoop();


    }

    public void paint(Graphics g) {
        super.paint(g);
        this.player.paint(g);
    }
    public void mainGameLoop () {
        new Thread(() -> {
            while (true) {
                repaint();
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    public void exitWindow() {

    }

}
