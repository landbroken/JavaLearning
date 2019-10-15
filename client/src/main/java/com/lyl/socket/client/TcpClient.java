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
	 * ��������
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
			// �ͷ�������������
			Socket socket = startup.createSocket();
			
			// Ҫ���͸�����������Ϣ
			try(OutputStream os = socket.getOutputStream();
					PrintWriter pw = new PrintWriter(os)) {
				pw.write("�ͻ��˷�����Ϣ");
				pw.flush();
			}
			
			socket.shutdownOutput();
			
			// �ӷ��������յ���Ϣ
			try(InputStream is = socket.getInputStream();
					BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
				String info = null;
				while((info = br.readLine())!=null){
					System.out.println("���ǿͻ��ˣ�������������Ϣ��"+info);
				}
			}
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
