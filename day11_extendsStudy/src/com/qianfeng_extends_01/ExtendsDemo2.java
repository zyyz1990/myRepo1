package com.qianfeng_extends_01;
/*
 * �̳е��ص�:
 * 		1)��Java��,�̳�(������֮��),ֻ֧�ֵ��̳�,��֧�ֶ�̳�!
 * 			
 * 			���е���������֧�ֶ�̳�: ���� extends ����1,����2{}...
 * 
 * 		2)��ȻJava��,�̳�(������֮��)��֧�ֶ�̳�,���ǿ��Զ��̳�!
 * 
 * */

class GrandFather{
	
	public void function() {
		System.out.println("����үү...");
	}
}

//����

class Father extends GrandFather{
	public void show() {
		System.out.println("��������...");
	}
}

//����
class Son extends Father{
	public void method() {
		System.out.println("����son...");
	}
}



//class Mother{}

//class Son extends Father,Mother{}
//class Son2 extends Mother{}
//������
public class ExtendsDemo2 {

	public static void main(String[] args) {
		
		//����:
		//�����������
		Son s = new Son() ;
		s.method();
		s.show();
		s.function();
	}
}
