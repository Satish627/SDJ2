package Sockets.ChatSystem.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer
{
  public void start()
  {
    try
    {
      ServerSocket serverSocket = new ServerSocket(3899);
      ConnectionPool cp= new ConnectionPool();

      System.out.println("Server started...");

      //create connection pool

      while (true)
      {
        Socket socket= serverSocket.accept();
        ChatServerHandler csh= new ChatServerHandler(socket,cp);
        cp.addConnection(csh);

        Thread t=new Thread(csh);
        t.start();

        //add to connection pool
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }
}
