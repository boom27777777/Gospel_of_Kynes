package com.cheet.kynesgame.objects;

import java.util.List;


public interface Level {
	
	public ImageObject getBackground();
	
	public List<Mob> getMobs();
	
	public CollidableAnimation getKynes();
	
	public List<Terrain> getTerrain(); 
	
	public Mob addMob(); 

}
