package com.thread;
class Mytherd2 implements Runnable{
	public void run() {
		int i=0;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}
public class test_thread2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Mytherd2 mytherd1=new Mytherd2();
		Thread thread1=new Thread(mytherd1, "线程1");
		thread1.start();
		Mytherd2 mytherd2=new Mytherd2();
		new Thread(mytherd2,"线程2").start();
		new Thread(new Mytherd2(),"线程3").start();
	}

}
