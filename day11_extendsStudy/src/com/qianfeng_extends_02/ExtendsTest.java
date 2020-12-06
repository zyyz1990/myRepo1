package com.qianfeng_extends_02;
//依据下面代码,在控制台分别打印,30,20,10
/*
 * this和super的区别
 * 	this.成员变量名;访问的是当前类的成员变量
 * 	super.成员变量名;访问的是父类的成员变量
 * 
 * 关于继承关系中子类和父类的成员变量名一致的情况,
 *  现在子类局部位置找,有就使用,
 *  没有,继续在子类的成员位置找,有就使用
 *  还没有,在父类的成员位置找
 * */
//看程序,写结果
class Father{
	
	public int num = 10 ;
}

class Son extends Father{
	public int num = 20 ;
	
	public void show() {
		int num = 30 ;
		//补全代码
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}	
}

public class ExtendsTest {
	public static void main(String[] args) {
		Son s = new Son();
		s.show(); 
	}
}
