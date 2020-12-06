package com.qianfeng_extends_test;

//猫类继承动物类
public class Cat extends Animal {

	public Cat() {
		super();
	}
	
	//以后创建Cat类对象的时候,使用有参构造
	//Cat c = new Cat("tom",3,"白色") ;  
	public Cat(String name, int age, String color) {
		super(name, age, color);//"tom",3,"白色"
	}
	
	//特有功能
	public void catchMouse() {
		System.out.println("猫抓老鼠...");
	}
	public void playGame() {
		System.out.println("猫可以玩毛线...");
	}
	
	//重写吃和睡的功能
	//@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void sleep() {
		System.out.println("猫趴着睡觉...");
	}

	
}
