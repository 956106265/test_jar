package com.thread;
class TicketWindow4 implements Runnable{
	private int tickets=100;
	@Override
	public void run() {
		while(true) {
			maipiao();
		}
	}
	private void maipiao() {
		// TODO 自动生成的方法存根
		if (tickets>0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
		}
	}
	
}
public class test_thread11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TicketWindow4 tw2=new TicketWindow4();
		new Thread(tw2,"窗口1").start();
		new Thread(tw2,"窗口2").start();
		new Thread(tw2,"窗口3").start();
		new Thread(tw2,"窗口4").start();
	}

}
