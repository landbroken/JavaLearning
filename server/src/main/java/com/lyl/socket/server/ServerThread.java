package com.lyl.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread{
	
	private Socket socket = null;
	
	public ServerThread(Socket socket) {
		this.socket = socket;
	}
 
	@Override
	public void run() {
		InputStream is=null;
        InputStreamReader isr=null;
        BufferedReader br=null;
        OutputStream os=null;
        PrintWriter pw=null;
        try {
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String info = null;
			
			while((info=br.readLine())!=null){
				System.out.println("���Ƿ��������ͻ���˵��"+info);
			}
			socket.shutdownInput();
			
			os = socket.getOutputStream();
			pw = new PrintWriter(os);
			pw.write("��������ӭ��");
			
			pw.flush();
        } catch (Exception e) {
			// TODO: handle exception
		} finally{
			//�ر���Դ
            try {
                if(pw!=null)
                    pw.close();
                if(os!=null)
                    os.close();
                if(br!=null)
                    br.close();
                if(isr!=null)
                    isr.close();
                if(is!=null)
                    is.close();
                if(socket!=null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
		}
	}
}
