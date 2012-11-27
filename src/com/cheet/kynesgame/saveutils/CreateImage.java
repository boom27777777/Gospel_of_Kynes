package com.cheet.kynesgame.saveutils;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;

import com.cheet.kynesgame.objects.ImageObject;

public class CreateImage {
	public static ImageObject createImage(String[] args) throws SlickException {
		String name = args[0];
		String[] imgDat = args[1].split(";");

		if (!imgDat[0].equalsIgnoreCase("Image")) {
			throw new SlickException("Invalid Image");
		}
		String path = imgDat[1];
		String[] cords = imgDat[2].split(",");

		return new ImageObject(name, new Image(path), new Vector2f(
				Integer.parseInt(cords[0]), Integer.parseInt(cords[1])));
	}
}
