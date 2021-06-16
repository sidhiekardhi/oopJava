package com.juaracoding.batch9;

public class Monster extends Heroes implements SoundMonster {

	String soundMonster() {
		return "meongg";
	}

	@Override
	public void soundM() {
		// TODO Auto-generated method stub
		System.out.println("hai manisss");
	}
	
	public void sound() {
		System.out.println("Monster Durhaka");
	}
}
