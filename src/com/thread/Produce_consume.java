package com.thread;

import java.util.ArrayList;
import java.util.List;

public class Produce_consume {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// 定义一个集合类，模拟存储生产的商品
		List<Object> goods = new ArrayList<Object>();
		// 记录线程执行统一的起始时间start
		long start = System.currentTimeMillis();
		// 创建一个生产者线程，用于生产商品并存入商品集合
		Thread thread1 = new Thread(() -> {
			int i = 0;
			while (System.currentTimeMillis() - start <100) {
				synchronized (goods) {
					if (goods.size() > 0) {
						try {
							goods.wait();
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					} else {
						goods.add("商品" + (++i));
						System.out.println("生产商品" + i);
					}
				}

			}
		}, "生产者");
		// 创建一个消费者线程，用于消费商品并将商品从商品集合删除
		Thread thread2 = new Thread(() -> {
			int j = 0;
			while (System.currentTimeMillis() - start <100) {
				synchronized (goods) {
					if (goods.size() <= 0) {
						goods.notify();
					} else {
						goods.remove("商品" + (++j));
						System.out.println("消费商品" + j);
					}
				}
			}
		}, "消费者");
		thread1.start();
		thread2.start();
	}

}
