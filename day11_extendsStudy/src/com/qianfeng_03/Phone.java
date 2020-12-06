package com.qianfeng_03;

/*
 * 手机事物
     属性:品牌,价格,颜色,内存
     行为:玩游戏,打电话,发短信...
     
利用工具书写 :使用Phone 描述手机事物并进行测试


alt+/ :代码提示

cltr+shift+/:将多行代码注释掉(多行注释的快捷键)
cltr+shift+\:取消多行注释

ctlr+/:单行注释  (再次ctlr+/:取消了单行注释)

alt+sift+s-->c  :创建无参构造方法
alt+shift+s-->o :创建有参构造方法
alt+shift+s-->r :提供公共的访问方法:setXXX(Xx xx)/getXXX

ctlr+d:删除某一行代码


ctrl+shift+o: 导包的快捷键

在创建对象的时候,new 类名() ;  使用ctrl+1/ctlr+2+l(字母),自动补全代码
 * */
public class Phone {
	
	//属性私有化
	private String brand ;
	private int price ;
	private String color ;
	private int memory ;
	
	//alt+shift+s--->c  :无参构造方法
	public Phone() {
		
	}

	//alt+shift+s--->o:有参构造方法
	public Phone(String brand, int price, String color, int memory) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.memory = memory;
	}

	
	//alt+shift+s--->r (提供对外的公共访问方法)
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

	//其他成员方法
	public void callPhone(String toName) {
		System.out.println("使用手机可以给"+toName+"打电话了!");
	}
	public void sendMsg() {
		System.out.println("使用手机可以微信聊天..");
	}

}
