package com.qianfeng_extends_02;
//�����������,�ڿ���̨�ֱ��ӡ,30,20,10
/*
 * this��super������
 * 	this.��Ա������;���ʵ��ǵ�ǰ��ĳ�Ա����
 * 	super.��Ա������;���ʵ��Ǹ���ĳ�Ա����
 * 
 * ���ڼ̳й�ϵ������͸���ĳ�Ա������һ�µ����,
 *  ��������ֲ�λ����,�о�ʹ��,
 *  û��,����������ĳ�Աλ����,�о�ʹ��
 *  ��û��,�ڸ���ĳ�Աλ����
 * */
//������,д���
class Father{
	
	public int num = 10 ;
}

class Son extends Father{
	public int num = 20 ;
	
	public void show() {
		int num = 30 ;
		//��ȫ����
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
