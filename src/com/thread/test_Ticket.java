package com.thread;
class TicketWindow extends Thread{
public TicketWindow(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
private int tickets=100;
public void run() {
	while(tickets>0){
		System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
	}
}
}
public class test_Ticket {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new TicketWindow("窗口1").start();
		new TicketWindow("窗口2").start();
		new TicketWindow("窗口3").start();
		new TicketWindow("窗口4").start();
	}

}
