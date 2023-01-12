package at.ran.test.designpatterns.basics;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class HTLCircle implements BaseComponents {
    Random random = new Random();
    private int x = random.nextInt(700)+100;
    private int y = random.nextInt(300)+100;
    private int height;
    private int width;

    public HTLCircle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void update(GameContainer gc, int delta) {

    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.green);
        graphics.fillOval(this.x, this.y, this.width, this.height);
    }
}
