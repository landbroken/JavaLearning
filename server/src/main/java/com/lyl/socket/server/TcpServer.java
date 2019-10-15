package com.lyl.socket.server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) {
		// 创建服务端socket
		try(ServerSocket serverSocket = new ServerSocket(8089)) {
			System.out.println("创建服务端socket，port = "+serverSocket.getLocalPort());
			// 创建客户端socket
			Socket socket = null;
			//循环监听等待客户端的连接
            while(true){
            	// 监听客户端
            	socket = serverSocket.accept();
            	
            	ServerThread thread = new ServerThread(socket);
            	thread.start();
            	
            	InetAddress address=socket.getInetAddress();
                System.out.println("当前客户端的IP："+address.getHostAddress());
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}
}
