package Network.Chat;

import java.net.*;
import java.io.*;
class SenderThread extends Thread {
    Socket socket;
    String name;
    SenderThread(Socket socket, String name) { 
        this.socket = socket;
        this.name = name;
    }
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            
	    // 占쏙옙占쏙옙 占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙화占쏙옙 占쌜쏙옙占싼댐옙.
	    writer.println(name);
            writer.flush();
           
	   // 키占쏙옙占쏙옙占� 占쌉력듸옙 占쌨쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쌜쏙옙 
	    while (true) {
                String str = reader.readLine();
                if (str.equals("bye"))
                    break;
                writer.println(str);
                writer.flush();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try { 
                socket.close(); 
            } 
            catch (Exception ignored) {
            }
        }
    }
}
