package com.cheet.kynesgame.saveutils;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import com.cheet.kynesgame.objects.CollidableImage;
import com.cheet.kynesgame.objects.ImageObject;

public class CreateColliadableImage {
	public static CollidableImage createColliadableImage(String[] args)
			throws SlickException {
		ImageObject image = CreateImage.createImage(args);

		String[] collisionData = args[3].split(";");

		int collisionType = Integer.parseInt(collisionData[0]);

		Shape shape = null;

		if (collisionData[1].equalsIgnoreCase("rectangle")) {
			String[] size = collisionData[2].split(",");
			shape = new Rectangle(Integer.parseInt(size[0]),
					Integer.parseInt(size[1]), Integer.parseInt(size[2]),
					Integer.parseInt(size[3]));
		} else if (collisionData[1].equalsIgnoreCase("circle")) {
			String[] size = collisionData[2].split(",");
			shape = new Circle(Integer.parseInt(size[0]),
					Integer.parseInt(size[1]), Integer.parseInt(size[2]));
		}

		return new CollidableImage(image.getName(), image.getImage(),
				image.getPosition(), shape, collisionType);
	}
}
