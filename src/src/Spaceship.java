package src;

import java.awt.*;

public class Spaceship implements Paintable {

    private Body body;

    public Spaceship () {
        this.body = new Body(30, 30, 30, 30);


    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public void paint(Graphics graphics) {
        this.body.paint(graphics);

    }
    public void move (int direction) {
        this.body.move(direction);

    }
}
