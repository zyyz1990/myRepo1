package com.qianfeng_extends_01;
/*
 * 继承的特点:
 * 		1)在Java中,继承(类与类之间),只支持单继承,不支持多继承!
 * 			
 * 			在有的语言里面支持多继承: 子类 extends 父类1,父类2{}...
 * 
 * 		2)虽然Java中,继承(类与类之间)不支持多继承,但是可以多层继承!
 * 
 * */

class GrandFather{
	
	public void function() {
		System.out.println("我是爷爷...");
	}
}

//父类

class Father extends GrandFather{
	public void show() {
		System.out.println("我是老子...");
	}
}

//子类
class Son extends Father{
	public void method() {
		System.out.println("我是son...");
	}
}



//class Mother{}

//class Son extends Father,Mother{}
//class Son2 extends Mother{}
//测试类
public class ExtendsDemo2 {

	public static void main(String[] args) {
		
		//测试:
		//创建子类对象
		Son s = new Son() ;
		s.method();
		s.show();
		s.function();
	}
}
