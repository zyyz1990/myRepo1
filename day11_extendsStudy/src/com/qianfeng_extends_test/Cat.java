package com.qianfeng_extends_test;

//è��̳ж�����
public class Cat extends Animal {

	public Cat() {
		super();
	}
	
	//�Ժ󴴽�Cat������ʱ��,ʹ���вι���
	//Cat c = new Cat("tom",3,"��ɫ") ;  
	public Cat(String name, int age, String color) {
		super(name, age, color);//"tom",3,"��ɫ"
	}
	
	//���й���
	public void catchMouse() {
		System.out.println("èץ����...");
	}
	public void playGame() {
		System.out.println("è������ë��...");
	}
	
	//��д�Ժ�˯�Ĺ���
	//@Override
	public void eat() {
		System.out.println("è����");
	}
	
	public void sleep() {
		System.out.println("èſ��˯��...");
	}

	
}
