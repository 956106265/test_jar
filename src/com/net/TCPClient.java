package com.net;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws Exception, IOException {
		File wjj=new File("d:\\upload");
		File[] wjjh=wjj.listFiles();
		for(File wj:wjjh) {
			wj.getName();
		}
		Socket khdtjz=new Socket("10.2.103.30",8899);
		// TODO 自动生成的方法存根
		OutputStream os=khdtjz.getOutputStream();
		//定义要上传的文件
		FileInputStream fin=new FileInputStream("d:\\1.jpg");
		byte[]zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while (b!=-1) {
			//System.out.println(new String(zjhc,0,b));
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		//os.close();
		//khdtjz.close();
		khdtjz.shutdownOutput();
		//通过客户端套接字获取网络上传来的输入流
		InputStream is=khdtjz.getInputStream();
		b=is.read(zjhc);
		while (b!=-1) {
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
	}

}
