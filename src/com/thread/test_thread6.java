package com.thread;
class DaemonThread implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true) {
			System.out.println(Thread.currentThread().getName()+"-----正在运行线程");
		}
	}
	
}
public class test_thread6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		if(! Thread.currentThread().isDaemon()) {
			System.out.println("main方法线程也就是主线程不是后台线程");
		}
		Thread t=new Thread(new DaemonThread(),"后台线程");
		if(!t.isDaemon()) {
			System.out.println("t线程不是后台线程");
		}
		t.setDaemon(true);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			
		}
	}

}
