package com.qianfeng_extends_01;
/*
 * �̳��е�ע������:
 * 
 * 	1)����̳и���,���ܼ̳и����˽�еĳ�Ա(��Ա����,��Ա����),
 * ԭ��:��˽�����ε������ʲ���,����ͨ�������ķ��ʷ�������ӷ���
 *  2)����̳и���,���ܹ��̳и���Ĺ��췽��,���ǿ���ͨ��super�ؼ���,����ӷ���(����ֽ�!)
 * */

//����
class Fu{
	private int num = 100 ;//˽�еĳ�Ա����
	
	public int num2 = 200 ;
	
	private void show() {
		System.out.println("show Fu...");
	}
	
	public void function() {
		show();
		System.out.println(num); //��ӵķ���ͨ��:function()
		System.out.println("function Fu...");
	}
	
}
//����
class Zi extends Fu{
	//�Լ��Ĺ���
	public void method() {
		System.out.println("method zi...");
	}
}
//������
public class ExtendsDemo3 {
	public static void main(String[] args) {
		//�����������
		Zi zi  = new Zi() ;
		//System.out.println(zi.num);//The field Fu.num is not visible :����ĳ�Ա����num������!
		zi.function();
		//zi.show() ;//The method show() from the type Fu is not visible :show��������˽�е�,������
		zi.method();
	}
}
