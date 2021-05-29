package src;

import java.awt.*;

    public class Body  implements Paintable {
        private int x;
        private int y;
        private int width;
        private int height;

        public Body(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }


        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public void paint(Graphics graphics) {
            graphics.setColor(Color.BLACK);
            graphics.fillOval(this.x, this.y, this.width, this.height);
        }

        @Override
        public void move(int direction) {
            switch (direction) {
                case 1:
                    this.x++;
                    break;
                case 2:
                    this.x--;
                    break;
                case 3:
                    this.y--;
                    break;
                case 4:
                    this.y++;
                    break;
            }


        }
      //  public void draw(){


       // }
    }


