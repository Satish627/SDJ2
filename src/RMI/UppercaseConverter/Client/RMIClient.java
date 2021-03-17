package RMI.UppercaseConverter.Client;

import RMI.UppercaseConverter.Shared.UppercaseServer;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    private UppercaseServer server;

    public RMIClient() {
    }

    public void startClient() throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localHost", 1199);
        server = (UppercaseServer) registry.lookup("Server");
    }

    public String toUpperCase(String argument) {
        String result = null;
        try {
            result = server.toUpperCase(argument);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new RuntimeException("Couldnot contact server");
        }
        return result;
    }
}
