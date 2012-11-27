package com.cheet.kynesgame.objects;

import java.util.List;

import org.newdawn.slick.Animation;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Vector2f;

public class Kynes extends CollidableAnimation implements CollidableObject {

	protected int hp;
	protected int lives;
	protected List<Item> items;
	protected List<Weapon> weapons;

	public Kynes(String _name, Animation _animation, Vector2f _position,
			Shape _collisionShape, int _collisionType) {
		super(_name, _animation, _position, _collisionShape, _collisionType);
	}

	public List<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public List<Item> getItems() {
		return items;
	}
}
