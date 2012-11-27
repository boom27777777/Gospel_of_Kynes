package com.cheet.kynesgame.objects;

import org.newdawn.slick.geom.Shape;

public interface CollidableObject {
	
	public Shape getNormalCollisionShape();
	
	public Shape getCollisionShape(); 
	
	public int getCollisionType();
	
	public boolean isCollidingWith(CollidableObject collideable);
	
}
