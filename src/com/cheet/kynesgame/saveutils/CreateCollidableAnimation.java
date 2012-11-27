package com.cheet.kynesgame.saveutils;

import org.newdawn.slick.Image;
import org.newdawn.slick.Animation;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Vector2f;

import com.cheet.kynesgame.objects.CollidableAnimation;

public class CreateCollidableAnimation {
	public CollidableAnimation createCollidableAnimation(String[] args)
			throws SlickException {
		String name = args[0];

		String[] imageData = args[1].split(";");

		if (!imageData[0].equalsIgnoreCase("ANIMATION")) {
			throw new SlickException("Animation tag is invalid");
		}

		String[] animationData = imageData[2].split(",");

		SpriteSheet ss = new SpriteSheet(new Image(imageData[1]),
				Integer.parseInt(animationData[0]),
				Integer.parseInt(animationData[1]));

		Animation animation = new Animation(ss,
				Integer.parseInt(animationData[2]));

		String[] coords = args[2].split(",");
		Vector2f position = new Vector2f(Integer.parseInt(coords[0]),
				Integer.parseInt(coords[1]));

		String[] collisionData = args[3].split(";");

		int collisionType = Integer.parseInt(collisionData[0]);

		Shape shape = null;

		if (collisionData[1].equalsIgnoreCase("RECTANGLE")) {
			String[] size = collisionData[2].split(",");
			shape = new Rectangle(Integer.parseInt(size[0]),
					Integer.parseInt(size[1]), Integer.parseInt(size[2]),
					Integer.parseInt(size[3]));
		} else if (collisionData[1].equalsIgnoreCase("CIRCLE")) {
			shape = new Circle(position.x, position.y,
					Float.parseFloat(collisionData[2]));
		}

		return new CollidableAnimation(name, animation, position, shape,
				collisionType);
	}
}
