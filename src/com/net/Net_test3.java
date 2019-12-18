package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Net_test3 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		DatagramSocket ds=new DatagramSocket(8900);
		//定义一个缓冲数组用于接受数据
		byte[] buf=new byte[1024];
		//定义一个数据报对象，用于封装接收数据
		DatagramPacket dp=new DatagramPacket(buf, buf.length);
		System.out.println("等待接收数据.....");
		while (true) {
			ds.receive(dp);
			String xinxi=new String(dp.getData(),0,dp.getLength());
			System.out.println(xinxi);
		}
	}

}
