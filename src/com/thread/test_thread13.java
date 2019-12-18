package com.thread;
class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	DeadLockThread(boolean flag) {
		this.flag=flag;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		if (flag) {
			while(true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName() +"----if----chopsticks");
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName() +"----if----knifeAndFork");
					}
				}
			}
		}else {
			while(true) {
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName() +"----else----knifeAndFork");
					synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName() +"----else----chopsticks");	
					}
				}
			}
		}
	}
	
}
public class test_thread13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DeadLockThread thread1=new DeadLockThread(true);
		DeadLockThread thread2=new DeadLockThread(false);
		//创建并开启两个线程
		new Thread(thread1,"Chinese").start();
		new Thread(thread2,"American").start();
	}

}
