package Sockets.MultiThreadedEchoExample.echoServer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class serverSocketHandler implements Runnable
{

  private final Socket socket;

  public serverSocketHandler(Socket socket)
  {
    this.socket= socket;
  }

  @Override public void run()
  {
    try
    {
      ObjectInputStream inFromClient = new ObjectInputStream(
          socket.getInputStream());
      ObjectOutputStream outToClient = new ObjectOutputStream(
          socket.getOutputStream());

      while (true)
      {
        String read = (String) inFromClient.readObject();
        if (read.equalsIgnoreCase("exit"))
        {
          socket.close();
          break;
        }

        System.out.println("Received from client .. " + read);
        String result = read.toUpperCase();
        outToClient.writeObject(result);
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }
  }
}
