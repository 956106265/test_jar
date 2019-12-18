package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Mythread implements Callable<Object>{
	@Override
	public Object call() throws Exception{
		int sum=0;
		for(int i=1;i<11;i++) {
			sum=i+sum;
		}
		switch (Thread.currentThread().getName()) {
		case "线程1":
			break;
		case "线程2":
			sum+=100;
			break;
		case "线程3":
			sum+=200;
			break;
		case "线程4":
			sum+=300;
			break;
		case "线程5":
			sum+=400;
			break;
		case "线程6":
			sum+=500;
			break;
		case "线程7":
			sum+=600;
			break;
		case "线程8":
			sum+=700;
			break;
		case "线程9":
			sum+=800;
			break;
		case "线程10":
			sum+=900;
			break;
		default:
			break;
		}
		return sum;
	}
}
public class test_thread5 {

	public static void main(String[] args) throws Exception, ExecutionException {
		// TODO 自动生成的方法存根
		Mythread mt1=new Mythread();
		FutureTask<Object> ft1=new FutureTask<>(mt1);
		new Thread(ft1,"线程1").start();
		//System.out.println("线程1求和的值为"+ft1.get());
		
		Mythread mt2=new Mythread();
		FutureTask<Object> ft2=new FutureTask<>(mt2);
		new Thread(ft2,"线程2").start();
		//System.out.println("线程2求和的值为"+ft2.get());
		
		Mythread mt3=new Mythread();
		FutureTask<Object> ft3=new FutureTask<>(mt3);
		new Thread(ft3,"线程3").start();
		
		Mythread mt4=new Mythread();
		FutureTask<Object> ft4=new FutureTask<>(mt4);
		new Thread(ft4,"线程4").start();
		
		Mythread mt5=new Mythread();
		FutureTask<Object> ft5=new FutureTask<>(mt5);
		new Thread(ft5,"线程5").start();
		
		Mythread mt6=new Mythread();
		FutureTask<Object> ft6=new FutureTask<>(mt6);
		new Thread(ft6,"线程6").start();
		
		Mythread mt7=new Mythread();
		FutureTask<Object> ft7=new FutureTask<>(mt7);
		new Thread(ft7,"线程7").start();
		
		Mythread mt8=new Mythread();
		FutureTask<Object> ft8=new FutureTask<>(mt8);
		new Thread(ft8,"线程8").start();
		
		Mythread mt9=new Mythread();
		FutureTask<Object> ft9=new FutureTask<>(mt9);
		new Thread(ft9,"线程9").start();
		
		Mythread mt10=new Mythread();
		FutureTask<Object> ft10=new FutureTask<>(mt10);
		new Thread(ft10,"线程10").start();
		int total=(int)ft1.get()+(int)ft2.get()+(int)ft3.get()+(int)ft4.get()+(int)ft5.get()+(int)ft6.get()+(int)ft7.get()+(int)ft8.get()+(int)ft9.get()+(int)ft10.get();
		System.out.println("线程1加到线程10的结果是:"+total);
	}

}
