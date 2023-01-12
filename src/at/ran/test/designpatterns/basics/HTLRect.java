package at.ran.test.designpatterns.basics;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class HTLRect implements BaseComponents {
    Random random = new Random();
    private int x = random.nextInt(700)+100;
    private int y = random.nextInt(400)+100;
    private int height, width;

    public HTLRect(int height, int width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.white);
        graphics.fillRect(x,y,this.width,this.height);
    }

    @Override
    public void update(GameContainer gc, int delta) {
        if (this.x <= 600) {
            this.x ++;
        } else {
            this.x =200;

        }
    }

}
