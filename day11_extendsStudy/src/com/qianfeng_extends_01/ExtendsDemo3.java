package com.qianfeng_extends_01;
/*
 * 继承中的注意事项:
 * 
 * 	1)子类继承父类,不能继承父类的私有的成员(成员变量,成员方法),
 * 原因:被私有修饰的外界访问不到,但是通过公共的访问方法来间接访问
 *  2)子类继承父类,不能够继承父类的构造方法,但是可以通过super关键字,来间接访问(下午分解!)
 * */

//父类
class Fu{
	private int num = 100 ;//私有的成员变量
	
	public int num2 = 200 ;
	
	private void show() {
		System.out.println("show Fu...");
	}
	
	public void function() {
		show();
		System.out.println(num); //间接的访问通过:function()
		System.out.println("function Fu...");
	}
	
}
//子类
class Zi extends Fu{
	//自己的功能
	public void method() {
		System.out.println("method zi...");
	}
}
//测试类
public class ExtendsDemo3 {
	public static void main(String[] args) {
		//创建子类对象
		Zi zi  = new Zi() ;
		//System.out.println(zi.num);//The field Fu.num is not visible :父类的成员变量num不可用!
		zi.function();
		//zi.show() ;//The method show() from the type Fu is not visible :show方法父类私有的,不可用
		zi.method();
	}
}
