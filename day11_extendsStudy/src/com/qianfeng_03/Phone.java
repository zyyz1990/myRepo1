package com.qianfeng_03;

/*
 * �ֻ�����
     ����:Ʒ��,�۸�,��ɫ,�ڴ�
     ��Ϊ:����Ϸ,��绰,������...
     
���ù�����д :ʹ��Phone �����ֻ����ﲢ���в���


alt+/ :������ʾ

cltr+shift+/:�����д���ע�͵�(����ע�͵Ŀ�ݼ�)
cltr+shift+\:ȡ������ע��

ctlr+/:����ע��  (�ٴ�ctlr+/:ȡ���˵���ע��)

alt+sift+s-->c  :�����޲ι��췽��
alt+shift+s-->o :�����вι��췽��
alt+shift+s-->r :�ṩ�����ķ��ʷ���:setXXX(Xx xx)/getXXX

ctlr+d:ɾ��ĳһ�д���


ctrl+shift+o: �����Ŀ�ݼ�

�ڴ��������ʱ��,new ����() ;  ʹ��ctrl+1/ctlr+2+l(��ĸ),�Զ���ȫ����
 * */
public class Phone {
	
	//����˽�л�
	private String brand ;
	private int price ;
	private String color ;
	private int memory ;
	
	//alt+shift+s--->c  :�޲ι��췽��
	public Phone() {
		
	}

	//alt+shift+s--->o:�вι��췽��
	public Phone(String brand, int price, String color, int memory) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.memory = memory;
	}

	
	//alt+shift+s--->r (�ṩ����Ĺ������ʷ���)
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	//������Ա����
	public void callPhone(String toName) {
		System.out.println("ʹ���ֻ����Ը�"+toName+"��绰��!");
	}
	public void sendMsg() {
		System.out.println("ʹ���ֻ�����΢������..");
	}

}
