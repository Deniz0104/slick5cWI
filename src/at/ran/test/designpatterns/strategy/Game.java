package at.ran.test.designpatterns.strategy;

import at.ran.test.designpatterns.basics.MainGame;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class Game extends BasicGame {

    private List<Actor> actors;

    public Game(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        MoveStrategy ms1 = new MoveLeft(300,0,0.1f);
        MoveStrategy ms2 = new MoveRight(400,100,0.3f);
        MoveStrategy ms3 = new MoveLeft(500,400,0.3f);

        Circle c1 = new Circle(ms1);
        Circle c2 = new Circle(ms2);
        Rectangle r1 = new Rectangle(ms3);

        this.actors.add(c1);
        this.actors.add(c2);
        this.actors.add(r1);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor: actors) {
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor: actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Game("Basic Patterns"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
