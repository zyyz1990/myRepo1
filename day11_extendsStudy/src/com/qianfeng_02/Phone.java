package com.qianfeng_02;
/*
 * 手机事物
     属性:品牌,价格,颜色,内存
     行为:玩游戏,打电话,发短信...
     
利用工具书写 :使用Phone 描述手机事物并进行测试
 * */

//手机类--描述手机事物
public class Phone {
	
	//属性私有化
	private String brand ;//品牌
	private int price ; //价格
	private String color ; //颜色
	private int memory ;
	
	//提供无参构造方法
	public Phone() {
		
	}
	
	//提供有参构造
	public Phone(String brand,int price ,String color,int memory) {
		this.brand = brand ;
		this.price = price ;
		this.color = color ;
		this.memory = memory ;
	}
	
	//提供公共的访问方法
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
	
	//其他成员方法
	public void callPhone(String toName) {
		System.out.println("使用手机可以给"+toName+"打电话了!");
	}
	public void sendMsg() {
		System.out.println("使用手机可以微信聊天..");
	}
	
	
}
