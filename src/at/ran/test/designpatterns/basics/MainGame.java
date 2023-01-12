package at.ran.test.designpatterns.basics;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {

    private List<BaseComponents> actors;

    public MainGame(String title) {
        super(title);
    }


    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        this.actors.add(new HTLRect(100,100));
        this.actors.add(new HTLCircle(40,70));
        this.actors.add(new HTLSnowflake(200,170));

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (BaseComponents actor: actors) {
            actor.update(gameContainer, delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (BaseComponents actor: actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Basic Patterns"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
