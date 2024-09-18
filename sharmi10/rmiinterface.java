import java.rmi.*;
import java.io.*;
import java.lang.*;
public interface rmiinterface extends Remote
{
public String display(String m)throws RemoteException;
}
