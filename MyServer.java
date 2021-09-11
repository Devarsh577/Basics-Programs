import java.io.*;
import java.net.*;

class MyServer
{
public static void main(String args[])
{

try
{
ServerSocket ss=new ServerSocket(3333);
Socket s=ss.accept();


DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


String msg1="",msg2="";

while(!msg1.equals("stop"))
{
msg1=dis.readUTF();
System.out.println("Client Says: "+msg1);

msg2=br.readLine();
dout.writeUTF(msg2);

dout.flush();

}


dis.close();
s.close();
ss.close();
}

catch(Exception ex)
{
System.out.println(ex);

}



}
}