/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcserever;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruan
 */
public class ServerManager {
    
    
    private ServerSocket servSock; 
    private Socket sock ; 
    private PrintWriter output ; 
    private BufferedReader input;
    private int Port ;

    public int getPort() {
        return Port;
    }

    public void setPort(int Port) {
        this.Port = Port;
    }

    public ServerManager(int Port) {
        this.Port = Port;
    }
    
    public void Connect() throws IOException{
        servSock = new ServerSocket(this.Port);
        sock = servSock.accept();
        output = new PrintWriter(sock.getOutputStream(),true);
        input = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        //output.println("Server Started Listening at: " + new Date());
        System.out.println("Server is online...");
//        while(true) {
            Socket socket = servSock.accept();
            ClientThread cT = new ClientThread(socket);
            new Thread(cT).start();
            
       // }
    }
    
    class ClientThread implements Runnable
    {
        Socket threadSocket;
         
        public ClientThread(Socket socket)
        {
            threadSocket = socket;
        }
         
        public void run()
        {
                PrintWriter output = null;
            try {            
                output = new PrintWriter(threadSocket.getOutputStream(), true);
                BufferedReader input = new BufferedReader(new InputStreamReader(threadSocket.getInputStream()));
               
                
                //output.println("You have connected at: " + new Date());
                while (true) {
                   
                    
                    String chatInput = input.readLine();
                    System.out.println(chatInput);
                    
                }
            } catch (IOException exception) {
                System.out.println("Error: " + exception);
            }
        }
    
 
    }
   
    
    
}
