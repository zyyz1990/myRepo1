package com.qianfeng_02;


//�ֻ��������
public class PhoneTest {
	
	public static void main(String[] args) {
		
		//��ʽ1
		//�޲ι��췽��+setXXX(XX x) ���ж���Ĵ����Լ���ֵ
		Phone p1 = new Phone() ;
		p1.setBrand("��Ϊmate30");
		p1.setPrice(6799);
		p1.setColor("��ջ�");
		p1.setMemory(128);
		System.out.println(p1.getBrand()+"---"+p1.getPrice()+"---"+
		p1.getColor()+"---"+p1.getMemory());
		
		
		p1.sendMsg(); 
		p1.callPhone("��ԲԲ") ;
		System.out.println("-------------------");
		
		//��ʽ2:
		//�вι��췽��
		Phone p2 = new Phone("Iphone11",5999,"������",64) ;
		System.out.println(p2.getBrand()+"---"+p2.getPrice()+"---"+
				p2.getColor()+"---"+p2.getMemory());
		p2.sendMsg(); 
		p2.callPhone("����");
		
	}
}
