package at.ran.test.designpatterns.strategy;

import org.newdawn.slick.Graphics;

public class Circle implements Actor{
    private MoveStrategy moveStrategy;

    public Circle(MoveStrategy moveStrategy) {
        super();
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void update(int delta) {
        moveStrategy.update(delta);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(moveStrategy.getX(), moveStrategy.getY(),20,20);
    }
}
