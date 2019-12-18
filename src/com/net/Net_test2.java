package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import com.mysql.fabric.xmlrpc.Client;

public class Net_test2 {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		DatagramSocket ds=new DatagramSocket(30000);	
		
		String str="陈思雨真帅";
		byte[] zjsz=str.getBytes("UTF-8");
		DatagramPacket dp=new DatagramPacket(zjsz, zjsz.length,InetAddress.getByName("10.2.103.233"),8900);
		System.out.println("开始发送信息.....");
		ds.send(dp);
		ds.close();
	}

}
