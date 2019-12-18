package Chatroom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

import com.api.string_equals;

public class ChatSender implements Runnable {
	private DatagramSocket ds;
	private int port;
	public ChatSender(DatagramSocket ds, int port) {
		// TODO 自动生成的构造函数存根
		this.ds=ds;
		this.port=port;
	}

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("我说:");
			String str=sc.nextLine();
			byte[] zjsz;
			zjsz = str.getBytes("UTF-8");
			System.out.println("这条信息要发给哪个IP:");
			String ip = sc.nextLine();
			DatagramPacket dp=new DatagramPacket(str.getBytes(), str.getBytes().length,InetAddress.getByName(ip),8900);
			System.out.println("开始发送信息.....");
			ds.send(dp);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	
	
	}

}
