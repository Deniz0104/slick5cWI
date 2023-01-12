package at.ran.test.designpatterns.strategy;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    public void update (int delta);
    public void render(Graphics graphics);
}
