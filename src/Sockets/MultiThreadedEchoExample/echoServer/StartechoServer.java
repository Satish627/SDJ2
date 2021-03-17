package Sockets.MultiThreadedEchoExample.echoServer;

public class StartechoServer
{
  public static void main(String[] args)
  {
    EchoServer es= new EchoServer();
    es.start();
  }
}
