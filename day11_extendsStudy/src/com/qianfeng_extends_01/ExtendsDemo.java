package com.qianfeng_extends_01;
/*
 *�̳еĸ���:
 *	��һЩ�๲�Ե����ݳ�ȡ����,
 *			����������һ������������,�����������������������һ�ֹ�ϵ(�̳й�ϵ:extends)
 *
 *
 *	�̳еĺô�:
 *	1)����˴���ĸ�����
 *  2)����˴����ά����
 *  3)����������ļ̳й�ϵ,�Ƕ�̬��ǰ������!
 *  
 *  �̳еĸ�ʽ
 *  	class ������{}
 *  
 *  	class ������ extends ������{}
 *  
 *  
 *  Java�еĿ���ԭ��:
 *  		�����,���ھ�
 *  
 *  		���:������֮��Ĺ�ϵ,Խ��Խ��! (�ڿ�����:���ͳ����������---->Spring���:IOC˼��:���Ʒ�ת)
 *  		�ھ�:���ĳ����������:��һ����������ɵ�,����һ���������!(ִ����)
 * */

//ʹ�ü̳�֮ǰ:
//����ѧ����
/*
class Student{
	
	//...�ṩ��������:
	public void eat() {
		System.out.println("ѧ�����˾���Ҫ�Է�...");
	}
	public void sleep() {
		System.out.println("ѧϰ����,����Ҫ��Ϣ...");
	}
}

//������
class Worker{
	
	public void eat() {
		System.out.println("����,����Ҫ�Է�...");
	}
	public void sleep() {
		System.out.println("��������,����Ҫ��Ϣ...");
	}
}
*/
//ʹ�ü̳е�˼��
//��������һ����:����:Person
class Person{
	
	public void eat() {
		System.out.println("����,����Ҫ�Է�...");
	}
	public void sleep() {
		System.out.println("����,����Ҫ��Ϣ...");
	}
}

//ѧ����
class Student extends Person{
	
	/*
	 * public void eat() {
		System.out.println("����,����Ҫ�Է�...");
	}
	public void sleep() {
		System.out.println("����,����Ҫ��Ϣ...");
	}
	 * */
}
//������
class Worker extends Person{}



//������
public class ExtendsDemo {

	public static void main(String[] args) {
		//����ѧ����
		Student s = new Student() ;
		s.eat(); 
		s.sleep(); 
		Worker w = new Worker() ;
		w.eat();
		w.sleep();
		
		System.out.println("--------------------------");
		//ʹ�ü̳еĺ�Ĳ���
		Student s2 = new Student() ;
		s2.eat();
		s2.sleep();
	}
}
