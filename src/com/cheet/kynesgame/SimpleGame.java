package com.cheet.kynesgame;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.AppGameContainer;
import com.cheet.kynesgame.RenderRec;

public class SimpleGame extends BasicGame {

	String rec = System.getProperty("user.dir");
	Image kynes = null;
	Image land = null;
	static RenderRec render = new RenderRec(); 
	
	public SimpleGame() {
		super("Gospal of Kynes");
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		land = new Image("rec/fetch.jpg");
		kynes = render.KynesImg();
	}

	@Override
	public void update(GameContainer gc, int delta)
			throws SlickException {
		InputConfig.run(gc);
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
		land.draw(0,0);
		kynes.draw(400-kynes.getWidth()/2,300-kynes.getHeight()/2);
	}

	public static void main(String[] args) {
		try {
			AppGameContainer app = new AppGameContainer(new SimpleGame());
			app.setDisplayMode(800, 600, false);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}