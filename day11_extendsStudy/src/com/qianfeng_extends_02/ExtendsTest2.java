package com.qianfeng_extends_02;

/*
 * this��super������
 * 	this.��Ա������;���ʵ��ǵ�ǰ��ĳ�Ա����
 * 	super.��Ա������;���ʵ��Ǹ���ĳ�Ա����
 * 
 * 	���ڼ̳��й��췽����ϵ����:
 * 	��������й��췽��Ĭ�Ϸ��ʸ�����޲�,��Ҫ�ø����Ƚ������ݳ�ʼ��,��������������ݳ�ʼ��!
 * 
father...
son...
30
20
10
 * 
 * */

//������,д���
class Father2{
	public int num = 10;
	public Father2() {
		System.out.println("father...");
	}
}
class Son2 extends Father2{
	public int num = 20 ;
	public Son2() {
		System.out.println("son...");
	}
	public void method() {
		int num = 30 ;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}
public class ExtendsTest2 {
	public static void main(String[] args) {
		Son2 s = new Son2() ;
		s.method(); 
		
		
	}
}
