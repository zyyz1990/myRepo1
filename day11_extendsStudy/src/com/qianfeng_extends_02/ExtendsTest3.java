package com.qianfeng_extends_02;
//������,л���


/*
 * ��������:
 * 	1)���������ȼ�����
 * 	��̬�����ִֻ��һ��,> �������� > ���췽��
 * ���г��������,jvm����﷨�ṹ,�и��ӹ�ϵ,�ȼ��ظ���,��������,��static��� �Ƚ��ڴ�
 *  2)�̳���:�ֲ��ʼ��
 *     �����ø����ʼ��(ִ�и���Ĺ��췽��)---->��������õ����������,���Ը����ȳ�ʼ��,
 *     Ȼ�������ʼ��(ִ������Ĺ��췽��)
 * */
class Person{
	static {
		System.out.println("Person�ľ�̬�����!");
	}
	public Person(){
		System.out.println("Person�Ĺ��췽��");
	}
	
	{
		System.out.println("Person�Ĺ�������");
	}
}
class Student extends Person{
	static {
		System.out.println("Student�ľ�̬�����!");
	}
	public Student() {
		System.out.println("student�Ĺ��췽��");
	}
	{
		System.out.println("student�Ĺ�������");
	}
}
public class ExtendsTest3 {
	public static void main(String[] args) {
		Student s = new Student() ;
		Student s2 = new Student() ;
	}
}
