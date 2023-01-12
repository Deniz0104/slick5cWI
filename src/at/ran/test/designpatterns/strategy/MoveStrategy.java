package at.ran.test.designpatterns.strategy;

import org.newdawn.slick.GameContainer;

public interface MoveStrategy {
    public void update(int delta);
    public float getX();
    public float getY();
}
