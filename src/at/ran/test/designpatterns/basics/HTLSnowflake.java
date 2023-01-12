package at.ran.test.designpatterns.basics;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class HTLSnowflake implements BaseComponents {
    private Image snowflake;
    private int x = 300;
    private int y = 300;
    private int height, width;

    public HTLSnowflake(int height, int width) throws SlickException {
        this.height = height;
        this.width = width;
        snowflake = new Image("testdata/snowflake-png.png");
        this.snowflake = snowflake.getScaledCopy(this.width /2, this.height / 2);
    }


    @Override
    public void render(Graphics graphics) {
        this.snowflake.draw();
    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.snowflake.rotate(0.1f);
    }
}
