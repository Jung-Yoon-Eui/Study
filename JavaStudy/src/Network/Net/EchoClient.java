package Network.Net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient { 

	private String ip; 
	private int port; 
	private String str; 
	BufferedReader file; 

	//�깮�꽦�옄
	public EchoClient(String ip, int port) throws IOException {
		
		this.ip = ip; 

		this.port = port; 

		Socket tcpSocket = getSocket(); 

		OutputStream os_socket = tcpSocket.getOutputStream(); 

		InputStream is_socket = tcpSocket.getInputStream(); 


		BufferedWriter bufferW = new BufferedWriter( new OutputStreamWriter(os_socket)); 

		BufferedReader bufferR = new BufferedReader( new InputStreamReader(is_socket)); 

		System.out.print("�엯�젰 : "); 

		file = new BufferedReader( new InputStreamReader(System.in));

		str = file.readLine(); 

		str += System.getProperty("line.separator");

		bufferW.write(str); 

		bufferW.flush(); 

		str = bufferR.readLine(); 

		System.out.println("Echo Result : " + str); 


		file.close(); 

		bufferW.close(); 

		bufferR.close(); 

		tcpSocket.close(); 

	} 

	public Socket getSocket() { 

		Socket tcpSocket = null; 

		try { 
			tcpSocket = new Socket(ip, port); 
		} catch (IOException ioe) {

			ioe.printStackTrace(); 
			System.exit(0);
		} 

		return tcpSocket; 

	}

	public static void main(String[] args) throws IOException { 

		new EchoClient("192.168.0.32", 3000); 

	} 

}