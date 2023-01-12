package at.ran.test.designpatterns.strategy;

import org.newdawn.slick.Graphics;

public class Rectangle implements Actor{
    private MoveStrategy moveStrategy;

    public Rectangle(MoveStrategy moveStrategy) {
        super();
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void update(int delta) {
        moveStrategy.update(delta);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(moveStrategy.getX(), moveStrategy.getY(), 30,30);
    }
}
