package com.qianfeng_extends_01;
/*
 *继承的概念:
 *	将一些类共性的内容抽取出来,
 *			单独定义在一个独立的类中,让这个独立的类和这多个类产生一种关系(继承关系:extends)
 *
 *
 *	继承的好处:
 *	1)提高了代码的复用性
 *  2)提高了代码的维护性
 *  3)类与类产生的继承关系,是多态的前提条件!
 *  
 *  继承的格式
 *  	class 父类名{}
 *  
 *  	class 子类名 extends 父类名{}
 *  
 *  
 *  Java中的开发原则:
 *  		低耦合,高内聚
 *  
 *  		耦合:类与类之间的关系,越少越好! (在开发中:降低程序间的耦合性---->Spring框架:IOC思想:控制反转)
 *  		内聚:完成某个事情能力:在一个类中能完成的,尽量一个类中完成!(执行力)
 * */

//使用继承之前:
//定义学生类
/*
class Student{
	
	//...提供两个功能:
	public void eat() {
		System.out.println("学生饿了就需要吃饭...");
	}
	public void sleep() {
		System.out.println("学习困了,就需要休息...");
	}
}

//工人类
class Worker{
	
	public void eat() {
		System.out.println("饿了,就需要吃饭...");
	}
	public void sleep() {
		System.out.println("工作困了,就需要休息...");
	}
}
*/
//使用继承的思想
//单独定义一个类:人类:Person
class Person{
	
	public void eat() {
		System.out.println("饿了,就需要吃饭...");
	}
	public void sleep() {
		System.out.println("困了,就需要休息...");
	}
}

//学生类
class Student extends Person{
	
	/*
	 * public void eat() {
		System.out.println("饿了,就需要吃饭...");
	}
	public void sleep() {
		System.out.println("困了,就需要休息...");
	}
	 * */
}
//工人类
class Worker extends Person{}



//测试类
public class ExtendsDemo {

	public static void main(String[] args) {
		//测试学生类
		Student s = new Student() ;
		s.eat(); 
		s.sleep(); 
		Worker w = new Worker() ;
		w.eat();
		w.sleep();
		
		System.out.println("--------------------------");
		//使用继承的后的测试
		Student s2 = new Student() ;
		s2.eat();
		s2.sleep();
	}
}
