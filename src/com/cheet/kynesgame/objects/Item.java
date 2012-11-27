package com.cheet.kynesgame.objects;

public class Item {
	
	protected String name;
	protected int effect;

	public int getEffect() {
		return effect;
	}

	public void setEffect(int effect) {
		this.effect = effect;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int effect(int hp){
		hp += effect;
		return hp;
	}
	
}
