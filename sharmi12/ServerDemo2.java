import java.io.*;
import java.net.*;
class ServerDemo2
{
public static void main(String args[])
{
try	
{
int port=Integer.parseInt(args[0]);
ServerSocket ss=new ServerSocket(port);
Socket s=ss.accept();
OutputStream os=s.getOutputStream();
DataOutputStream dos=new DataOutputStream(os);
System.out.println("Enter a string");
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(r);
String s1=in.readLine();
dos.writeUTF(s1);
s.close();
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
}
}
