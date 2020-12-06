package com.qianfeng_extends_03;
/*
 * 继承中的成员方法关系问题
 * 
 * 		1)成员方法名不一致的情况:分别访问即可! (比较简单)
 * 		2)成员方法名称一致的情况:
 * 
 * 				先在子类中找是否存在这个方法,如果存在,就使用,会将父类的方法覆盖掉(等会讲方法重写)
 * 			如果子类找不到这个方法,就在父类中找,有就使用;
 * 			如果父类中都找不到,就报错了!
 * 
 * 	子类出现了和父类一模一样 的方法
 * 			
 * */

//父类
class Fu{
	
	public void method() {
		System.out.println("method Fu...");
	}
	
}
//子类
class Zi extends Fu{
	public void show() {
		System.out.println("show Zi...");
	}
	/*
	public void method() {
		System.out.println("method Zi...");
	}
	*/
}

//测试类
public class ExtendsDemo {

	public static void main(String[] args) {
		
		//创建子类对象
		Zi zi = new Zi() ;
		zi.show() ;
		zi.method();
	}
}
