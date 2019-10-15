package com.lyl.socket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	/**
	 * 创建连接
	 * @return
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public Socket createSocket() throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",8089);
		return socket;
	}
	
	public static void main(String[] args) throws InterruptedException {
		TcpClient startup = new TcpClient();
		try {
			// 和服务器创建连接
			Socket socket = startup.createSocket();
			
			// 要发送给服务器的信息
			try(OutputStream os = socket.getOutputStream();
					PrintWriter pw = new PrintWriter(os)) {
				pw.write("客户端发送信息");
				pw.flush();
			}
			
			socket.shutdownOutput();
			
			// 从服务器接收的信息
			try(InputStream is = socket.getInputStream();
					BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
				String info = null;
				while((info = br.readLine())!=null){
					System.out.println("我是客户端，服务器返回信息："+info);
				}
			}
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
