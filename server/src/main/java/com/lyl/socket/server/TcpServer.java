package com.lyl.socket.server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) {
		// ���������socket
		try(ServerSocket serverSocket = new ServerSocket(8089)) {
			System.out.println("���������socket��port = "+serverSocket.getLocalPort());
			// �����ͻ���socket
			Socket socket = null;
			//ѭ�������ȴ��ͻ��˵�����
            while(true){
            	// �����ͻ���
            	socket = serverSocket.accept();
            	
            	ServerThread thread = new ServerThread(socket);
            	thread.start();
            	
            	InetAddress address=socket.getInetAddress();
                System.out.println("��ǰ�ͻ��˵�IP��"+address.getHostAddress());
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}
}
