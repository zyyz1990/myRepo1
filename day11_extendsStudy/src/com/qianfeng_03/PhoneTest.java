package com.qianfeng_03;

import java.util.Scanner;

//�ֻ���Ĳ�����
public class PhoneTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("����¼��һ��int��������:");
		int num = sc.nextInt() ;
		System.out.println(num);
		
		System.out.println("---------------------");
		 
		//����
		Phone p1 = new Phone() ;
		p1.setBrand("��Ϊp30");
		p1.setPrice(4999);
		p1.setColor("�ٻ�ɫ");
		p1.setMemory(64);
		System.out.println(p1.getBrand()+"---"+p1.getPrice()+"---"+
		p1.getColor()+"---"+p1.getMemory());
		
		p1.sendMsg();
		p1.callPhone("ϰ��");
		
		System.out.println("----------------------------------------");
		
		Phone p2 = new Phone("�����ֻ�", 1699, "��ɫ", 128) ;
		System.out.println(p2.getBrand()+"---"+p2.getPrice()+"---"+
				p2.getColor()+"---"+p2.getMemory());
		p2.sendMsg();
		p2.callPhone("����");
	}
}
