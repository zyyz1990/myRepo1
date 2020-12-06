package com.qianfeng_02;


//手机类测试类
public class PhoneTest {
	
	public static void main(String[] args) {
		
		//方式1
		//无参构造方法+setXXX(XX x) 进行对象的创建以及赋值
		Phone p1 = new Phone() ;
		p1.setBrand("华为mate30");
		p1.setPrice(6799);
		p1.setColor("深空灰");
		p1.setMemory(128);
		System.out.println(p1.getBrand()+"---"+p1.getPrice()+"---"+
		p1.getColor()+"---"+p1.getMemory());
		
		
		p1.sendMsg(); 
		p1.callPhone("高圆圆") ;
		System.out.println("-------------------");
		
		//方式2:
		//有参构造方法
		Phone p2 = new Phone("Iphone11",5999,"土豪金",64) ;
		System.out.println(p2.getBrand()+"---"+p2.getPrice()+"---"+
				p2.getColor()+"---"+p2.getMemory());
		p2.sendMsg(); 
		p2.callPhone("文章");
		
	}
}
