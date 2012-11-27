package com.cheet.kynesgame.objects;

import java.util.HashMap;

import org.newdawn.slick.Animation;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Vector2f;

public class Mob extends CollidableAnimation {

	protected String name;
	protected Animation animation;
	protected Vector2f position;
	protected HashMap<String, Vector2f> path;
	protected Vector2f direction;
	protected float speed;

	public Mob(String _name, Animation _animation, Vector2f _position,
			Shape _collisionShape, int _collisionType) {
		super(_name, _animation, _position, _collisionShape, _collisionType);
	}

	public void setDirection(Vector2f direction) {
		this.direction = direction.copy();
	}

	public Vector2f getDirection() {
		return direction;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getSpeed() {
		return this.speed;
	}
	public void setPath(Vector2f start, Vector2f end){
		path.put("start", start);
		path.put("end", end);
	}
}
