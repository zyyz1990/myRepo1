package com.qianfeng_02;
/*
 * �ֻ�����
     ����:Ʒ��,�۸�,��ɫ,�ڴ�
     ��Ϊ:����Ϸ,��绰,������...
     
���ù�����д :ʹ��Phone �����ֻ����ﲢ���в���
 * */

//�ֻ���--�����ֻ�����
public class Phone {
	
	//����˽�л�
	private String brand ;//Ʒ��
	private int price ; //�۸�
	private String color ; //��ɫ
	private int memory ;
	
	//�ṩ�޲ι��췽��
	public Phone() {
		
	}
	
	//�ṩ�вι���
	public Phone(String brand,int price ,String color,int memory) {
		this.brand = brand ;
		this.price = price ;
		this.color = color ;
		this.memory = memory ;
	}
	
	//�ṩ�����ķ��ʷ���
	public void setBrand(String brand) {
		
		this.brand = brand ;
	}
	
	public void setPrice(int price) {
		this.price = price ;
	}
	
	public void setColor(String color) {
		this.color = color ;
	}
	
	public void setMemory(int memory) {
		this.memory = memory ;
	}
	
	public String getBrand() {
		return brand ;
	}
	
	public int getPrice() {
		return price ;
	}
	
	public String getColor() {
		return color ;
		
	}
	public int getMemory() {
		return memory ;
	}
	
	//������Ա����
	public void callPhone(String toName) {
		System.out.println("ʹ���ֻ����Ը�"+toName+"��绰��!");
	}
	public void sendMsg() {
		System.out.println("ʹ���ֻ�����΢������..");
	}
	
	
}
