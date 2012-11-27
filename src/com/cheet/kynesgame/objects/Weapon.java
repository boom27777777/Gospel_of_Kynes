package com.cheet.kynesgame.objects;

import org.newdawn.slick.Image;

public class Weapon {
	
	protected String name;
	protected Image sprite;
	protected int damage;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Image getSprite() {
		return sprite;
	}
	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
}
