package RMI.UppercaseConverter.Shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UppercaseServer extends Remote {

    String toUpperCase(String str) throws RemoteException;
}
