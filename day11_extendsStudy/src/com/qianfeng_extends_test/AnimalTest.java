package com.qianfeng_extends_test;
/*
 * è������
 * 
 * è ���� 
 * 		����:����,����,��ɫ...
 * 		��Ϊ:è����,è��ë��...
 * 			ץ����..   
 * 			��˯
 * 
 * �� ����
 * 		����:����,����,��ɫ...
 * 		��Ϊ:������,���Թ�ͷ...
 * 			��˯
 * 
 *��è�͹��Ĺ�������,��ǰ����������----->������ Animal
 *����è�̳��Զ�����
 * 		
 * ��д����:
 * 		��д����:������
 * 
 * 		��������...
 * 
 * */

//������
public class AnimalTest {
	public static void main(String[] args) {
		//����è��
		//��ʽ1:�޲ι���+setXXX(XX xx) + getXXX()
		Cat c1 = new Cat() ;
		c1.setName("����A��");
		c1.setAge(5);
		c1.setColor("��ɫ");
		System.out.println(c1.getName()+"---"+c1.getAge()+"---"+c1.getColor());
		
		c1.eat();
		c1.sleep();
		c1.catchMouse();
		c1.playGame();
		System.out.println("-----------------------------------------------");
		
		//��ʽ2:�вι��췽����ֵ
		Cat c2 = new Cat("tomè", 3, "�ٻ�ɫ") ;
		System.out.println(c2.getName()+"---"+c2.getAge()+"---"+c2.getColor());
		c2.catchMouse();
		c2.playGame();
		c2.eat();
		c2.sleep();
		
		//�����Լ�����
	}
}
