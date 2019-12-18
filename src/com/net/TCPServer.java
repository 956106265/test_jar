package com.net;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		ServerSocket fwqtjz=new ServerSocket(8899);
		//监听8899端口
		while (true) {
			//通过客户端套接字获取客户端的IP地址
			Socket khdtjz=fwqtjz.accept();
			new Thread(()->{
				try {
					String ip=khdtjz.getInetAddress().getHostAddress();
					int port=khdtjz.getPort();
					//System.out.println("和客户端的IP地址是"+ip+",端口是"+port+"连接上了");
					FileOutputStream fout=new FileOutputStream("d:\\Favorites\\"+ip+".jpg");
					byte[]zjhc=new byte[1024];
					InputStream is=khdtjz.getInputStream();
					int b=is.read(zjhc);
					while (b!=-1) {
						fout.write(zjhc,0,b);
						b=is.read(zjhc);
					}
					String xinxi="文件上传成功";
					zjhc=new byte[1024];
					//通过客户端套接字获取输入流
					OutputStream os=khdtjz.getOutputStream();
					//通过输出流写入到网络中
					os.write(xinxi.getBytes("UTF-8"));
					os.close();
					khdtjz.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}).start();
			
		}
		
	}
}
