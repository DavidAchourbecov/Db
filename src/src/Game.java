package src;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    //ToDo:**1)calss of Allianes.
    //       2)SpaceShip Drawing
    //       3)Make A Start Butten $
    // **


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
        this.player = new Spaceship();
        this.enemy = new Spaceship();
        this.fillEmptyArea=new FillEmptyArea(500,360,30,30);
        PlayerMovement playerMovement = new PlayerMovement(this.player);
        EnemyMovement enemyMovement = new EnemyMovement(this.enemy);
        this.addKeyListener(playerMovement);
        mainGameLoop();
        optionPaneExample();
        //enemy = ImageIO.read(getClass().getResource("airX.jpg"));





    }

    public void paint(Graphics g) {
        super.paint(g);
        this.player.paint(g);
    }

    public void mainGameLoop() {
        JLabel title = new JLabel();
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
}
