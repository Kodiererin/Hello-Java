package ProjectChatApp;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client 
{
//	We will be using Threads 
	
	private Socket socket;
	private BufferedWriter bufferedWriter;
	private BufferedReader bufferedReader;
	private String username;
	
	public Client(Socket socket , String username)
	{
		try {
			this.socket = socket;
			this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.username = username;
		}
		catch(IOException e)
		{
			closeEverything(socket , bufferedReader , bufferedWriter);
		}
	}
	
	public void sendMessage()
	{
		try
		{
			bufferedWriter.write(username);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			
			Scanner sc = new Scanner(System.in);
			while(socket.isConnected())
			{
				String messageToSend = sc.nextLine();
				bufferedWriter.write(username+" "+messageToSend);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}
		}
		catch(IOException e)
		{
			closeEverything(socket, bufferedReader , bufferedWriter);
		}
	}
	
	public void listenForMessage() 
	{
		new Thread(new Runnable()				// we are creating an object and hitting Start!
		{
			public void run()
			{
				String messageFromGroupChat;
				
				while(socket.isConnected())
				{
					try
					{
						messageFromGroupChat = bufferedReader.readLine();
						System.out.println(messageFromGroupChat);
					}
					catch(IOException e)
					{
						closeEverything(socket,bufferedReader , bufferedWriter);
					}
				}
			}
		}).start();
	}
	
	public void closeEverything(Socket socket , BufferedReader bufferedReader , BufferedWriter bufferedWriter)
	{
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
	
	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Username for Group Chat");
		String username = sc.nextLine();
		
		
		Socket socket = new Socket("localHost",1234);
		Client client = new Client(socket,username);
		
		client.listenForMessage();
		client.sendMessage();
	}
}
