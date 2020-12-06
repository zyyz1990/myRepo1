package com.qianfeng_extends_02;

/*
 * this和super的区别
 * 	this.成员变量名;访问的是当前类的成员变量
 * 	super.成员变量名;访问的是父类的成员变量
 * 
 * 	关于继承中构造方法关系问题:
 * 	子类的所有构造方法默认访问父类的无参,需要让父类先进行数据初始化,才是子类进行数据初始化!
 * 
father...
son...
30
20
10
 * 
 * */

//看程序,写结果
class Father2{
	public int num = 10;
	public Father2() {
		System.out.println("father...");
	}
}
class Son2 extends Father2{
	public int num = 20 ;
	public Son2() {
		System.out.println("son...");
	}
	public void method() {
		int num = 30 ;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}
public class ExtendsTest2 {
	public static void main(String[] args) {
		Son2 s = new Son2() ;
		s.method(); 
		
		
	}
}
