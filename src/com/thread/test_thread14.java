package com.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class test_thread14 {

	public static void main(String[] args) throws Exception, Exception {
		// TODO 自动生成的方法存根
		//创建第一个线程。从1加到10
		CompletableFuture<Integer> cf1=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for (int i = 0; i < 11; i++) {
				sum=sum+i;
			}
			return sum;
		});
		//创建第二个线程，从11加到20
		CompletableFuture<Integer> cf2=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for (int j = 11; j < 21; j++) {
				sum=sum+j;
			}
			return sum;
		});
		int total=cf1.get()+cf2.get();
		System.out.println("两个线程求和结果是:"+total);
	}

}
