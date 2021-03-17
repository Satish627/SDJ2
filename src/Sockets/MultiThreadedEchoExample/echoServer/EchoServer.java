package Sockets.MultiThreadedEchoExample.echoServer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer
{
  public void start()
  {
    System.out.println("Starting server...");
    try
    {
      ServerSocket serverSocket = new ServerSocket(3999);
      System.out.println("Server connected");
      while (true)
      {
        Socket socket = serverSocket.accept();
        System.out.println("Welcome myaan");


        serverSocketHandler ssh=new serverSocketHandler(socket);
        Thread t= new Thread(ssh);
        t.start();

      }

    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
