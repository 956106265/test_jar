package com.thread;
class EmergencyThread implements Runnable{
	public void run() {
		// TODO 自动生成的方法存根
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+"输入："+i);
		}
	}
	
}
public class test__thread9 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		Thread thread1=new Thread(new EmergencyThread(),"线程1");
		thread1.start();
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+"输入："+i);
			if (i==2) {
				thread1.join();
			}
		}
	}

}
