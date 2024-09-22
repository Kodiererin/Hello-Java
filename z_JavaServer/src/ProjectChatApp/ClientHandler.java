package ProjectChatApp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

//	this class will implement the runnable interface so...0
public class ClientHandler implements Runnable
{
//	and its instances will be created over a single thread.
	
//	First we will have  a array list of every instances create over this class.
	
	public static ArrayList<ClientHandler> clientHandlers = new ArrayList<>();
//	The Purpose of the array list is keep track of all clients so that whenever a client sends a message  we can loop throught the array list of the client
//	and send the message to each client.
//	So this array list is important to us for allowing to communicate or send messages or broadcast message to multiple client instead of just one server,
//	This is static because it belong to a class and each object of the class.
	
	private Socket socket;		// this will be the socket which will be passed from the server class.
//	This is used to estabilish a connetion between a client and a server.
	
	private BufferedReader  bufferedReader;		// this will be used to read data ecpecially messages. that has been send from the client.
	private BufferedWriter bufferedWriter; 			// this will be used to send specific data to the client.
//	And this will be the messaged that are sent from the other client and this will be broadcasted using Arraylist.
	private String clientUsername;			// username of the client
	
	public ClientHandler(Socket socket)
	{
		try
		{
			this.socket = socket;			// means that this is the object which is being made from this class.
											// for that object being made set the socket to what is passed into the constructor.
											// however we have to set the buffered reader and BufferedWriter to set the socket.
			
//			Socket : A socket basically represents  the  connection between the server  or client handler if a client and each socket connection has a output stream where you can use the send data  whatever it is you are connected to and input-stream by which you can read data connected to  that hasv send to you..
			
//			setting bufferedWriter 
			new OutputStreamWriter(socket.getOutputStream());
			
//			In Java there are two types of stream. Byte Stream and Character stream.
//			And we are using character Stream because be are sending messages.
//			Send in Java character stream  and with the word writer || byte stream with the word streams.
//			CharacterStream => OutputStreamWriter
//			ByteStream => socket.getOutputStream() 
//			Because we are wrapping ByteStream into the CharacterStream because we want to send over a characters.
			
//			we will use buffer which will make the communication more efficient.
			
			this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));			// this is what the client is sending 
			
			this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));			// this is what we will send.
			
//			Whenever a client starts then first you have to enter username for the group chat.
			
			this.clientUsername = bufferedReader.readLine();		// after pressing the enter key the client sends the username.
			clientHandlers.add(this);			// this represents the client handler object 
			broadCastMessage("Server :"+clientUsername + " has entered the chat");
					
		} catch(IOException e)
		{
			closeEverything(socket,bufferedReader , bufferedWriter);
		}
	}
	
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
//		Everything in this method is what is running on thread.
//		We will be listening methods on the read which will be blocking operations.
//		BlockingOperations : means that the application will be stuck until the operation is completed.
//		Everything we will do , will do in the different thread.
//		First Thread : We will be listening messages and another one working with the rest of our application
//		If not it then our program will be sitting waiting for the message to come in.
//		But we also want to send messages to the client.
		
		String messageFromClient;
		
		while(socket.isConnected())
		{
			try
			{
				messageFromClient = bufferedReader.readLine();
				broadCastMessage(messageFromClient);
			
			}catch(IOException e)
			{
				closeEverything(socket,bufferedReader , bufferedWriter);
				break;				// client disconnects then come out of the loop.
			}
		}
	}
	
	public void broadCastMessage(String messageToSend)
	{
		for(ClientHandler clientHandler : clientHandlers)
		{
			try
			{
				if(!clientHandler.equals(clientUsername))
				{
					clientHandler.bufferedWriter.write(messageToSend);
					clientHandler.bufferedWriter.newLine();
					clientHandler.bufferedWriter.flush(); 			// to send the Data to the server
				}
			}
			catch(IOException e)
			{
				closeEverything(socket,bufferedReader,bufferedWriter);
				
			}
		}
	}
	public void removeClientHandler()
	{
		clientHandlers.remove(this);
		broadCastMessage("Server"+clientUsername+" has left the Chat");
		
	}
	public void closeEverything(Socket socket,BufferedReader bufferedReader , BufferedWriter bufferedWriter)
	{
		removeClientHandler();
		try
		{
			if(bufferedReader!=null)
				bufferedReader.close();
			if(bufferedWriter!=null)
				bufferedWriter.close();
			if(socket!=null)
				socket.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
