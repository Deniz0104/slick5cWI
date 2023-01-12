package at.ran.test.designpatterns.basics;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;


public interface BaseComponents {
    public void render(Graphics graphics);
    public void update(GameContainer gc, int delta);
}
