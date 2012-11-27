package com.cheet.kynesgame.objects;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;


public class AnimationObject implements LevelObject {

	protected String name;
	protected Animation animation;
	protected Vector2f position;

	public AnimationObject(String _name, Animation _animation,
			Vector2f _position) {
		name = _name;
		animation = _animation;
		position = _position;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setPosition(Vector2f position) {
		this.position = position;
	}

	@Override
	public Vector2f getPosition() {
		return position;
	}

	@Override
	public void render(Graphics graphics) {
		animation.draw(position.x, position.y);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) {
		animation.update(delta);
	}

}
