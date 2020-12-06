package com.qianfeng_extends_01;
/*
 * 加入继承关系之后,类的成员访问问题:
 * 		成员变量
 * 
 * 分为两种情况:
 * 		1)子类中和父类中成员变量名称不一致的情况:  比较简单的,分别访问即可!
 * 		2)子类中和父类中成员变量名称一致的情况:
 * 			遵循"就近原则"
 * 		 2.1)先在子类的局部位置找,如果存在,就使用;
 * 		 2.2)如果局部位置没有,那么就在子类的成员位置中找,如果有,就使用;
 * 		 2.3)如果子类的成员位置中没有,那么直接在父类的成员位置找,有就使用;
 * 		 2.4)如果父类的成员位置都没有的,那么就报错了,不存在这个变量!
 * 		
 * */
//父类
class Fu2{
	
	//父类的成员变量
	public int num = 10 ;
	
}

//子类
class Zi2 extends Fu2{
	
	//子类的成员变量
	public int num2 = 20 ;
	
	//定义成员变量
	//public int num = 50 ;
	//定义子类的成员方法show
	public void show() {
		//int num = 30 ; //局部变量
		System.out.println(num) ;
	}
	
}



//测试类
public class ExtendsDemo4 {
	
	public static void main(String[] args) {
		
		//创建子类对象
		Zi2 zi = new Zi2() ;
		//分别访问即可
		System.out.println(zi.num) ;
		System.out.println(zi.num2);
		System.out.println("--------------------");
		
		//当子类的成员变量名和父类的成员变量名称一致,并且子类的成员方法还存在
		//同名的变量,访问方式-----遵循"就近原则"
		zi.show();
	}
}
