package com.qianfeng_03;

import java.util.Scanner;

//手机类的测试类
public class PhoneTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("请您录入一个int类型数据:");
		int num = sc.nextInt() ;
		System.out.println(num);
		
		System.out.println("---------------------");
		 
		//测试
		Phone p1 = new Phone() ;
		p1.setBrand("华为p30");
		p1.setPrice(4999);
		p1.setColor("橘黄色");
		p1.setMemory(64);
		System.out.println(p1.getBrand()+"---"+p1.getPrice()+"---"+
		p1.getColor()+"---"+p1.getMemory());
		
		p1.sendMsg();
		p1.callPhone("习总");
		
		System.out.println("----------------------------------------");
		
		Phone p2 = new Phone("锤子手机", 1699, "黑色", 128) ;
		System.out.println(p2.getBrand()+"---"+p2.getPrice()+"---"+
				p2.getColor()+"---"+p2.getMemory());
		p2.sendMsg();
		p2.callPhone("文章");
	}
}
