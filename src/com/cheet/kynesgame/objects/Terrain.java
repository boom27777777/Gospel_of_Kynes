package com.cheet.kynesgame.objects;

import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Vector2f;

public class Terrain extends CollidableImage {

	public Terrain(String _name, Image _image, Vector2f _position,
			Shape _CollisionShape, int _CollisionType, Shape _collisionShape,
			int _collisionType) {
		super(_name, _image, _position, _CollisionShape, _CollisionType);
	}

}
