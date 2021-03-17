package Sockets.echo.echoClient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient
{
  public void runClient(){
    //connect to server
    try
    {
      Socket socket= new Socket("localHost",3999);
      System.out.println("Client connected..");

      ObjectOutputStream outToServer= new ObjectOutputStream(socket.getOutputStream());
      ObjectInputStream inFromServer= new ObjectInputStream(socket.getInputStream());


    //send message to server
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the message> ");
      String s= scan.nextLine();
      outToServer.writeObject(s);


    //read result from server
      String result = (String) inFromServer.readObject();
      System.out.println("From server.." + result);
    }
    catch (IOException | ClassNotFoundException e)
       {
          e.printStackTrace();
        }
  }
}
