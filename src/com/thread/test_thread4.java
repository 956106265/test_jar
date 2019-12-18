package com.thread;
class TicketWindow2 implements  Runnable{
	private int tickets=100;
	public void run() {
		while(true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
			} else {
				break;
			}
		}
	}
}
public class test_thread4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TicketWindow2 tw2=new TicketWindow2();
		new Thread(tw2,"窗口1").start();
		new Thread(tw2,"窗口2").start();
		new Thread(tw2,"窗口3").start();
		new Thread(tw2,"窗口4").start();
	}

}
