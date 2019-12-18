package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketWindow5 implements Runnable {
	private int tickets = 100;
	// 定义一个Lock锁对象
	private final Lock lock = new ReentrantLock();

	public void run() {
		while (true) {
			lock.lock();
			if (tickets > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets-- + "张票");
				}
			}
		}
	}
}

public class test_thread12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TicketWindow5 tw2 = new TicketWindow5();
		new Thread(tw2, "窗口1").start();
		new Thread(tw2, "窗口2").start();
		new Thread(tw2, "窗口3").start();
		new Thread(tw2, "窗口4").start();
	}

}
