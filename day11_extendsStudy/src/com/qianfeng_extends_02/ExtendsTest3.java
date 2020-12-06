package com.qianfeng_extends_02;
//看程序,谢结果


/*
 * 两个考点:
 * 	1)代码块的优先级问题
 * 	静态代码块只执行一次,> 构造代码块 > 构造方法
 * 运行程序的试试,jvm检查语法结构,有父子关系,先加载父类,再是子类,跟static相关 先进内存
 *  2)继承中:分层初始化
 *     优先让父类初始化(执行父类的构造方法)---->子类可能用到父类的数据,所以父类先初始化,
 *     然后子类初始化(执行子类的构造方法)
 * */
class Person{
	static {
		System.out.println("Person的静态代码块!");
	}
	public Person(){
		System.out.println("Person的构造方法");
	}
	
	{
		System.out.println("Person的构造代码块");
	}
}
class Student extends Person{
	static {
		System.out.println("Student的静态代码块!");
	}
	public Student() {
		System.out.println("student的构造方法");
	}
	{
		System.out.println("student的构造代码块");
	}
}
public class ExtendsTest3 {
	public static void main(String[] args) {
		Student s = new Student() ;
		Student s2 = new Student() ;
	}
}
