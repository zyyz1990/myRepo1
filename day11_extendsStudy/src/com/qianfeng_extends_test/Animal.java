package com.qianfeng_extends_test;
//������
public class Animal {
	
	//����˽�л�
	private String name ; //����
	private int age ; //����
	private String color ;//��ɫ
	
	//alt+shift+s--c:�޲ι���
	public Animal() {
	}
	
	//alt+shift+s--o:�вι��췽��
	public Animal(String name, int age, String color) {//"tom",3,"��ɫ"
		this.name = name; //"tom"
		this.age = age; //3
		this.color = color; //"��ɫ"
	}
	
	
	//�ṩ�����ķ��ʷ��� 
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
	
	//������������Ա����
	public void eat() {
		System.out.println("�����˶��˾���Ҫ�Է�...");
	}
	public void sleep() {
		System.out.println("�������˾���Ҫ��Ϣ...");
	}
	
}
