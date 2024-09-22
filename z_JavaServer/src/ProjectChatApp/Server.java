package ProjectChatApp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server 
{
	private ServerSocket  serverSocket;		// this class is responsible for listening clients in creating a socket object to communicate with them.
	
	public Server(ServerSocket serverSocket )
	{
		this.serverSocket = serverSocket;
	}
//	creating a method start server that will responsible for keeing the server running
	
	public void startServer()
	{
		try
		{
//			We want that tour server socket is running until it is closed
			while(!serverSocket.isClosed())
			{
				Socket socket = serverSocket.accept();		// this method is a blocking method meaning that our program will be haulted here until the client connects
//				However when our client does connect socket object is returned which helps to communicate with client.
				System.out.println("A nw Client has Connected ");
				
				ClientHandler clienthandler = new ClientHandler(socket);
//				Each object of this class will re responsible for communicating with the client
//				This class will also implement the interface runnable.
				
//				Runnable is implemented on the class whose instance will each be executed by a seperate thread and this is vital to a functioning of the appliation.
//				It within spawn a new head of the connection to the each new client or application which will able to handle one client at a time.
				
//				When we make a class we will make a constructor that accepts a socket method.
				
//				But to create a thread object we have to pass a thread object as an instance of the class objectthat implements runnable.
				
				Thread thread = new Thread(clienthandler);
//				It will implement runnable, and the class that implements runnable made rom that class run a new thread and to do that we have to pass that into or create a new thread object.
//				and we use the start object to start a new thread.
				
				thread.start();
			}
		}
		catch(IOException a)
		{
			
		}
	}
	
	public void closeServerSocket()		// this method is used bevause when the error occurs we want to close the servercocket.
	{
//		first make sure that the servercocket is not null because if it is null then we will get an exception.
		try
		{
			if(serverSocket!=null)
				serverSocket.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket(1234); 		// 1234 is the port number
//		Port number has to match when we create a client later.
//		Server will say that he want to talks to the port number 1234.
		
		
		Server server = new Server(serverSocket);
		server.startServer();
	}		
}
