package com.cheet.kynesgame.objects;

import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.geom.Vector2f;

public class CollidableImage extends ImageObject implements CollidableObject {

	protected Shape collisionShape;
	protected int collisionType;

	public CollidableImage(String _name, Image _image, Vector2f _position,
			Shape _CollisionShape, int _CollisionType) {
		super(_name, _image, _position);

		collisionShape = _CollisionShape;
		collisionType = _CollisionType;
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

	@Override
	public boolean isCollidingWith(CollidableObject collidable) {
		return this.getCollisionShape().intersects(
				collidable.getCollisionShape());
	}

}
