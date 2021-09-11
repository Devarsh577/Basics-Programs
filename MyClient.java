
import java.util.*;
import java.io.*;
import java.net.*;

class MyClient
{
public static void main(String args[])
{

try
{
Scanner sc=new Scanner(System.in);
Socket s=new Socket("127.0.0.1",3333);

DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


String msg1="",msg2="";

while(!msg1.equals("stop"))
{
msg1=br.readLine();
dout.writeUTF(msg1);
dout.flush();

msg2=dis.readUTF();
System.out.println("Server Says: "+msg2);

}
dout.close();
s.close();
}
catch(Exception ex)
{
System.out.println(ex);

}

}
}