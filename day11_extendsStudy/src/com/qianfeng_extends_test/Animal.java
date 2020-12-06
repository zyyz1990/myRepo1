package com.qianfeng_extends_test;
//动物类
public class Animal {
	
	//属性私有化
	private String name ; //姓名
	private int age ; //年龄
	private String color ;//颜色
	
	//alt+shift+s--c:无参构造
	public Animal() {
	}
	
	//alt+shift+s--o:有参构造方法
	public Animal(String name, int age, String color) {//"tom",3,"白色"
		this.name = name; //"tom"
		this.age = age; //3
		this.color = color; //"白色"
	}
	
	
	//提供公共的访问方法 
	//setXXX(xx x) /getXXX()   :alt+shift+s--->r
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//其他的两个成员方法
	public void eat() {
		System.out.println("动物了饿了就需要吃饭...");
	}
	public void sleep() {
		System.out.println("动物困了就需要休息...");
	}
	
}
