package com.qianfeng_extends_test;

//����
public class Dog extends Animal {
	
	//alt+shift+s--c
	public Dog() {
		super();
	}

	public Dog(String name, int age, String color) {
		super(name, age, color);
	}
	
	//���й���
	public void  palyGame() {
		System.out.println("����è...");
	}
	public void lookDoor() {
		System.out.println("������...");
	}
	
	//��д�Ժ�˯�Ĺ���
	public void eat() {
		System.out.println("���Թ�ͷ");
	}
	public void sleep() {
		System.out.println("������˯��...");
	}
	

	
}
