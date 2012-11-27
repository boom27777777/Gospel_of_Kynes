package com.cheet.kynesgame;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class RenderRec {
	public Image KynesImg() throws SlickException {
		Image kynes = new Image("rec/kynes.png");
		kynes.setName("Kynes");
		kynes.setCenterOfRotation(kynes.getWidth()/2, kynes.getHeight()/2);
		return kynes;
	}
}
