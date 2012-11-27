package com.cheet.kynesgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

public class InputConfig {
	
	static public void run(GameContainer gc){
		Input input = gc.getInput();
		if (input.isKeyDown(Input.KEY_D)){
			System.out.println("key Down");
		}
		if (input.isKeyDown(Input.KEY_A)){
			System.out.println("key Down");
		}
		if (input.isKeyDown(Input.KEY_S)){
			System.out.println("key Down");
		}
		if (input.isKeyDown(Input.KEY_W)){
			System.out.println("key Down");
		}
		if (input.isKeyDown(Input.KEY_SPACE)){
			System.out.println("key Down");
		}
	}
}
