package com.qianfeng_extends_02;
/*
 * 
 * 子类继承父类,关于构造方法的问题
 * 	子类不能继承父类的构造方法,但是可以通过super间接访问父类的构造方法
 * 
 * 	子类的所有构造方法默认访问父类的无参构造方法!
 * 	为什么要访问父类的无参构造方法?
 * 	
 * 构造方法的目的:就是为了数据初始化
 * 由于存在继承关系,创建的是子类对象,对子类初始化的时候(执行构造方法),可能会用到父类的数据,必须
 * 要让父类先进行初始化(先执行父类的构造方法),父类初始化完毕了,才是子类初始化(分层初始化!)
 * 
 * 注意:每一个子类的构造方法中的第一句话
 * 				默认存在super() ; 可以不写(隐藏的)
 * 
 * 	super:代表父类的空间标识(代表父类对象的地址值引用)
 * 
 * */
//父类
class Fu{
	
	//提供一个父类的无参构造方法
	public Fu() {
		System.out.println("这是Fu的无参构造方法...");
	}
	
	
}

//子类
class Zi extends Fu{
	
	//子类的无参构造方法
	public Zi() {
		super() ;//默认的,可以不写
		System.out.println("这是Zi的无参构造方法...");
		
		
	}
	
	//子类的有参构造方法
	public Zi(String name) {
		//super() ;//默认的,可以不写
		System.out.println("这是Zi的有参构造方法...");
	}
}

//测试类
public class ExtendsDemo {

	public static void main(String[] args) {
		//创建子类对象
		Zi zi = new Zi() ;
		System.out.println("-----------------------");
		Zi zi2 = new Zi("高圆圆") ;
	}
}
