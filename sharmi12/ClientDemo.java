import java.io.*;
import java.net.*;
class ClientDemo2
{
public static void main(String args[])
{
try	
{
String server=args[0];
int port=Integer.parseInt(args[1]);
Socket s=new Socket(server,port);
InputStream is=s.getInputStream();
DataInputStream dis=new DataInputStream(is);
String s1=dis.readUTF();
System.out.println("Received string is:"+s1);
s.close(); 
}
catch(Exception e)
{
System.out.println("exception e:"+e);
}
}
}
