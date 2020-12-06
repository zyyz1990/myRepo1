package com.qianfeng_extends_test;

//狗类
public class Dog extends Animal {
	
	//alt+shift+s--c
	public Dog() {
		super();
	}

	public Dog(String name, int age, String color) {
		super(name, age, color);
	}
	
	//特有功能
	public void  palyGame() {
		System.out.println("狗玩猫...");
	}
	public void lookDoor() {
		System.out.println("狗看门...");
	}
	
	//重写吃和睡的功能
	public void eat() {
		System.out.println("狗吃骨头");
	}
	public void sleep() {
		System.out.println("狗躺着睡觉...");
	}
	

	
}
