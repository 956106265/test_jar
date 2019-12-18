package com.thread;
class YieldThread extends Thread{

	public YieldThread(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"----:"+i);
			if(i==2) {
				System.out.println(" 线程让步：");
				Thread.yield();
			}
		}
	}
}
public class test_thread8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new YieldThread("线程1").start();
		new YieldThread("线程2").start();
	}

}
