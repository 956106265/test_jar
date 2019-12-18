package com.thread;

class TicketWindow3 implements Runnable {
	private int tickets = 100;
	// 定义对象作为同步锁
	Object lock = new Object();

	public void run() {
		while (true) {
			synchronized (lock) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets-- + "张票");
				}} 
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets-- + "张票");
				}
				else {
					break;
				}
			
		}
	}
}

public class test_thread10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TicketWindow3 tw2 = new TicketWindow3();
		new Thread(tw2, "窗口1").start();
		new Thread(tw2, "窗口2").start();
		new Thread(tw2, "窗口3").start();
		new Thread(tw2, "窗口4").start();
	}

}
