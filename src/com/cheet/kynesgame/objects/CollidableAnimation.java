package com.cheet.kynesgame.objects;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.geom.Vector2f;

public class CollidableAnimation extends AnimationObject implements
		CollidableObject {

	private Shape collisionShape;
	private int collisionType;

	public CollidableAnimation(String _name, Animation _animation,
			Vector2f _position, Shape _collisionShape, int _collisionType) {
		super(_name, _animation, _position);
		collisionShape = _collisionShape;
		collisionType = _collisionType;
	}

	@Override
	public Shape getNormalCollisionShape() {
		return collisionShape;
	}

	@Override
	public Shape getCollisionShape() {
		return collisionShape.transform(Transform.createTranslateTransform(
				position.x, position.y));
	}

	@Override
	public int getCollisionType() {
		return collisionType;
	}
	
	public Animation getAnimation(){
		return animation;
	}
	
	public void render(Graphics graphics) {
		super.render(graphics);
		
		graphics.draw(getCollisionShape());
	}

	@Override
	public boolean isCollidingWith(CollidableObject collidable) {
		return this.getCollisionShape().intersects(collidable.getCollisionShape());
	}

}
