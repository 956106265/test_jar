package Chatroom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import org.apache.commons.math3.fitting.leastsquares.EvaluationRmsChecker;


public class ChatReceiver implements Runnable {

    private DatagramSocket ds;
    public ChatReceiver(DatagramSocket ds) {
		// TODO 自动生成的构造函数存根
    	this.ds=ds;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		byte[] buf=new byte[1024];
		//定义一个数据报对象，用于封装接收数据
		DatagramPacket dp=new DatagramPacket(buf, buf.length);
		System.out.println("等待接收数据.....");
		while (true) {
			try {
				ds.receive(dp);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			String xinxi=new String(dp.getData(),0,dp.getLength());
			System.out.println(dp.getAddress().getHostAddress()+":"+xinxi);
		}
	}
	}

