package com.qianfeng_extends_03;
/*
 * �̳��еĳ�Ա������ϵ����
 * 
 * 		1)��Ա��������һ�µ����:�ֱ���ʼ���! (�Ƚϼ�)
 * 		2)��Ա��������һ�µ����:
 * 
 * 				�������������Ƿ�����������,�������,��ʹ��,�Ὣ����ķ������ǵ�(�Ȼὲ������д)
 * 			��������Ҳ����������,���ڸ�������,�о�ʹ��;
 * 			��������ж��Ҳ���,�ͱ�����!
 * 
 * 	��������˺͸���һģһ�� �ķ���
 * 			
 * */

//����
class Fu{
	
	public void method() {
		System.out.println("method Fu...");
	}
	
}
//����
class Zi extends Fu{
	public void show() {
		System.out.println("show Zi...");
	}
	/*
	public void method() {
		System.out.println("method Zi...");
	}
	*/
}

//������
public class ExtendsDemo {

	public static void main(String[] args) {
		
		//�����������
		Zi zi = new Zi() ;
		zi.show() ;
		zi.method();
	}
}
