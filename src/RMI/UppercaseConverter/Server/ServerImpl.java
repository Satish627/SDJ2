package RMI.UppercaseConverter.Server;

import RMI.UppercaseConverter.Shared.UppercaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Locale;

public class ServerImpl implements UppercaseServer {
    public ServerImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this,0);
    }

    @Override
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
