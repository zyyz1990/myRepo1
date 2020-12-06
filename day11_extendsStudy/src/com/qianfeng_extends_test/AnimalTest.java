package com.qianfeng_extends_test;
/*
 * 猫狗案例
 * 
 * 猫 事物 
 * 		属性:姓名,年龄,颜色...
 * 		行为:猫吃鱼,猫玩毛线...
 * 			抓老鼠..   
 * 			吃睡
 * 
 * 狗 事物
 * 		属性:姓名,年龄,颜色...
 * 		行为:狗看门,狗吃骨头...
 * 			吃睡
 * 
 *将猫和狗的共性内容,提前到独立类中----->动物类 Animal
 *狗和猫继承自动物类
 * 		
 * 书写代码:
 * 		书写父类:动物类
 * 
 * 		再是子类...
 * 
 * */

//测试类
public class AnimalTest {
	public static void main(String[] args) {
		//测试猫类
		//方式1:无参构造+setXXX(XX xx) + getXXX()
		Cat c1 = new Cat() ;
		c1.setName("多啦A梦");
		c1.setAge(5);
		c1.setColor("蓝色");
		System.out.println(c1.getName()+"---"+c1.getAge()+"---"+c1.getColor());
		
		c1.eat();
		c1.sleep();
		c1.catchMouse();
		c1.playGame();
		System.out.println("-----------------------------------------------");
		
		//方式2:有参构造方法赋值
		Cat c2 = new Cat("tom猫", 3, "橘黄色") ;
		System.out.println(c2.getName()+"---"+c2.getAge()+"---"+c2.getColor());
		c2.catchMouse();
		c2.playGame();
		c2.eat();
		c2.sleep();
		
		//狗类自己测试
	}
}
