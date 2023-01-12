package at.ran.test.designpatterns.strategy;



public class MoveRight implements MoveStrategy{
    private float x, y, speed;

    public MoveRight(float x, float y, float speed) {
        super();
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void update(int delta) {
        this.x += delta * speed;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }
}
