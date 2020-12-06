package com.qianfeng_extends_03;
/*
 * 需求:
 * 
 * 手机,本身的功能就是打电话,随着科技发展,又研发了一款新手机,不仅可以打电话,还可以
 * 天气预报...
 * 使用代码方式体现出来!
 * 
 * 
 * 面试题:
 * 	方法重载(Overload) 和方法重写(Override)的去区别?
 * 	方法重载:
 * 		方法名相同,参数类别不同,与返回值无关
 * 					参数个数
 * 					参数类型
 * 
 * 
 * 	方法重写:
 * 			子类继承父类的时候,子类出现了和父类一模一样的方法...(方法覆盖,方法复写...)
 * 			举例:
 * 				动物的吃,和睡 
 * 
 * 				具体动物:猫/狗 两个吃和睡不一样,所以需要将Animal类中吃和睡重写!
 * */
//以前的手机
class Phone{
	//打电话的功能
	public void call() {
		System.out.println("手机可以打电话了...");
	}
}

//这个新的手机应该是手机类的一种
class NewPhone extends Phone{
	
	//一个功能:将父类的功能覆盖掉
	//@Override :jdk提供一个注解: 说明当前这个方法是否是重写父类的方法
	public void call() {
		//延用以前手机可以打电话的功能
		super.call(); 
		System.out.println("手机可以看天气预报了...");
	}
	
	
}
//测试类
public class ExtendsDemo2 {

	public static void main(String[] args) {
		//创建子类对象
		NewPhone np = new NewPhone() ;
		np.call();
	}
}
