import java.rmi.*;
import java.io.*;
class rmiclient
{
public static void main(String a[]) throws IOException
{
try
{
String url="rmi://"+a[0]+"/messageserver";
rmiinterface r=(rmiinterface)Naming.lookup(url);
System.out.println("Enter  a message:");
DataInputStream dim=new DataInputStream(System.in);
String m=dim.readLine();
String s=r.display(m);
System.out.println(s);
}
catch(Exception e)
{
System.out.println("Error="+e);
}
}
}
