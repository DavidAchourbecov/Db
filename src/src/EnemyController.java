package src;
import java.awt.*;
import java.util.Random;

public  abstract class EnemyController implements EnemyPaint {
    //private Body body;
    private int x;
    private int y;
    private int width;
    private int height;
    private Head head;
    private int dy=3;
    private int dx=3;

    public EnemyController(Body body) {
        body = new Body(Constants.SPACESHIP_X, Constants.SPACESHIP_Y, Constants.SPACESHIP_WIDTH, Constants.SPACESHIP_HEIGHT);
        this.head = new Head(1500, 500, 500, 90, 200, 200);

    }

    /*public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

     /*
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(this.x, this.y, this.width, this.height);
    }

    public void move() {
        this.x +=dx;
        this.y +=dy;
        if (this.y>=this.height-Constants.SPACESHIP_HEIGHT || this.y<=0){
            dy=-dy;

        }if(this.x>=this.width-Constants.SPACESHIP_WIDTH || this.x<=0){
            dx=-dx;

        }

    }
}

public class Enemy {
    int posX, posY, dx, dy;

    public Enemy() {
        posX = posY = 300;
        int valueDX = (4 - (new Random().nextInt(8)));
        int valueDy = (4 - (new Random().nextInt(8)));
        dx = valueDX == 0 ? 4 : valueDX;
        dy = valueDY == 0 ? 4 : valueDY;
    }

    void move() {
        posX += dx
        if (isCollided(1)) {
            dx = -dx;
            posX += dx;
        }
        posY += dy;
        if (isCollided(1)) {
            dy = -dy;
            posy += dy;
        }
    }

    boolean isCollided(int object) {
       /* return (grid[posY / titleSize][posX / titleSize] == object ||
                grid[(posY + size / titleSize) - 1][posX / titleSize] == object ||
                grid[posY / titleSize][(posX + size) / titleSize - 1] == object ||

          grid[((posY + size) / titleSize) - 1][((posX + size) / titleSize) - 1] == object ||);

        */
    }




