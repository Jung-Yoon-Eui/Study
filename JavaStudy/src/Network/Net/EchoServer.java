package Network.Net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer{ 

	//�엯異쒕젰 
	private BufferedReader bufferR; 
	private BufferedWriter bufferW; 
	private InputStream is; 
	private OutputStream os; 

	//�꽌踰꾩냼耳�
	private ServerSocket serverS; 

	//�깮�꽦�옄 
	public EchoServer(int port){ 

		try{ 
			serverS = new ServerSocket(port); 
		}catch(IOException ioe){ 
			ioe.printStackTrace(); 
			System.exit(0);
		} 


		while(true){ 

			try{ 

				System.out.println("�겢�씪�씠�뼵�듃�쓽 �슂泥��쓣 湲곕떎由щ뒗 以�"); 

				Socket tcpSocket = serverS.accept(); 

				System.out.println("�겢�씪�씠�뼵�듃�쓽 IP 二쇱냼 : "+ tcpSocket.getInetAddress().getHostAddress()); 


				is = tcpSocket.getInputStream(); 

				os = tcpSocket.getOutputStream(); 


				bufferR = new BufferedReader( new InputStreamReader(is)); 

				bufferW = new BufferedWriter( new OutputStreamWriter(os)); 


				String message = bufferR.readLine(); 

				System.out.println("�닔�떊硫붿떆吏� : "+ message); 

				
				message += System.getProperty("line.separator");

				bufferW.write(message); 

				bufferW.flush(); 

				bufferR.close(); 

				bufferW.close(); 

				tcpSocket.close(); 

			}catch(IOException ioe){ 

				ioe.printStackTrace(); 
			} 
		} 
	} 

	public static void main(String[] args){ 

		new EchoServer(3000); 

	} 
} 