import java.rmi.*;
import java.rmi.server.*;
class rmiimplementingclass extends UnicastRemoteObject implements rmiinterface
{
public rmiimplementingclass() throws RemoteException
{
}
public String display(String m) throws RemoteException
{
return "message :"+m;
}
public static void main(String args[])
{
try
{
rmiimplementingclass rm=new rmiimplementingclass();
Naming.rebind("messageserver",rm);
}
catch(Exception e)
{
System.out.println("Error!"+e);
}
}
}  

