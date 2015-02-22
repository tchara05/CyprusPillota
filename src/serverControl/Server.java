package serverControl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	// Sockets //
	private Socket connection1;
	private Socket connection2;
	private Socket connection3;
	private Socket connection4;

	// Server sockets //
	private ServerSocket server1;
	private ServerSocket server2;
	private ServerSocket server3;
	private ServerSocket server4;

	// Streams //
	private ObjectInputStream input1;
	private ObjectOutputStream output1;
	private ObjectInputStream input2;
	private ObjectOutputStream output2;
	private ObjectInputStream input3;
	private ObjectOutputStream output3;
	private ObjectInputStream input4;
	private ObjectOutputStream output4;

	public Server() throws IOException {
		server1 = new ServerSocket(1231);
		server2 = new ServerSocket(1232);
		server3 = new ServerSocket(1233);
		server4 = new ServerSocket(1234);

	}

	
	public void sendMessage(final String message) {

		try {
			output1.writeObject(message);
			output1.flush();
			output2.writeObject(message);
			output2.flush();
			output3.writeObject(message);
			output3.flush();
			output4.writeObject(message);
			output4.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
public void WaitForConnection() throws IOException{
	
	
		boolean c1=false;
		boolean c2=false;
		boolean c3=false;
		boolean c4=false;
		
		while(!(c1&&c2&&c3&&c4)){
	
			if(!c1){
				connection1 = server1.accept();
				c1 = true;
				System.out.println("Connected 1");
			}
			if(!c2){
				connection2 = server2.accept();
				c2 = true;
				System.out.println("Connected 2");
			}
			if(!c3){
				connection3 = server3.accept();
				c3 = true;
				System.out.println("Connected 3");
			}	
			if(!c4){
				connection4 = server4.accept();
				c4 = true;
				System.out.println("Connected 4");
			}	
			
			
		}
		
	}
	
	
public void setupStreams() throws IOException{
	
	
	
	output1 = new ObjectOutputStream(connection1.getOutputStream());
	output1.flush();
	input1 = new ObjectInputStream(connection1.getInputStream());
	output1.writeObject("0");
	output1.flush();
	
	
	output2 = new ObjectOutputStream(connection2.getOutputStream());
	output2.flush();
	input2 = new ObjectInputStream(connection2.getInputStream());
	output2.writeObject("1");
	output2.flush();
	
	output3 = new ObjectOutputStream(connection3.getOutputStream());
	output3.flush();
	input3 = new ObjectInputStream(connection3.getInputStream());
	output3.writeObject("2");
	output3.flush();
	
	output4 = new ObjectOutputStream(connection4.getOutputStream());
	output4.flush();
	input4 = new ObjectInputStream(connection4.getInputStream());
	output4.writeObject("3");
	output4.flush();
	
	
	
}
	
	
	
	
	
	
}
