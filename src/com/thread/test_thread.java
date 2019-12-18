package com.thread;
class Mytherd1 extends Thread{
	public Mytherd1(String name) {
		super(name);
	}
//重写Thread类的run()方法
public void run() {
	int i=0;
	while(i++<5) {
		System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
	}
}
}
public class test_thread {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Mytherd1("线程1").start();
		new Mytherd1("线程2").start();
	}

}
