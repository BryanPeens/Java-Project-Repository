/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcserever;

import helperpackage.DataHandler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruan
 */
public class McSerever {

 

    /**
     * @param args the command line arguments
     */
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

    public McSerever() {
        try {
            Registry r = LocateRegistry.createRegistry(8080);
            DataHandler DB = new DataHandler();
            r.bind("DBClas", DB);
            System.out.println("server started");
            
        } catch (RemoteException ex) {
            System.out.println(ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(McSerever.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   

    /**
     *
     * @throws IOException
     */
    
    public static void Connect() throws IOException{
        
        
        
//       ServerSocket servSock = new ServerSocket(8080);
//       Socket sock = servSock.accept();
//       PrintWriter output = new PrintWriter(sock.getOutputStream(),true);
//       BufferedReader input = new BufferedReader(new InputStreamReader(sock.getInputStream()));
//        //output.println("Server Started Listening at: " + new Date());
//        System.out.println("Server is online...");
////        while(true) {
//            Socket socket = servSock.accept();
//        ClientThread cT;
//        cT =  new ClientThread(socket);
//            new Thread(cT).start();
//            output.println("user Conected");
//       // }
    }
    
    static class  ClientThread implements Runnable
    {
        Socket threadSocket;
         
        public ClientThread(Socket socket)
        {
            threadSocket = socket;
        }
         
        @Override
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
    public static void printme(String output){
        System.out.println(output);
    }
    
    public static void main(String[] args) throws IOException {
       
        System.out.println("  __  __       _____        __      __       \n" +
" |  \\/  |     / ____|       \\ \\    / /       \n" +
" | \\  / | ___| (___   ___ _ _\\ \\  / /__ _ __ \n" +
" | |\\/| |/ __|\\___ \\ / _ \\ '__\\ \\/ / _ \\ '__|\n" +
" | |  | | (__ ____) |  __/ |   \\  /  __/ |   \n" +
" |_|  |_|\\___|_____/ \\___|_|    \\/ \\___|_|   \n" +
"                                             ");
        System.out.println("  ______   ______   ______   ______   ______    \n" +
" /_____/  /_____/  /_____/  /_____/  /_____/  \n" +
" /_____/  /_____/  /_____/  /_____/  /_____/   \n" +
"                                                                                          \n" +
"                                                                                          ");
        McSerever ss = new McSerever();
        
        // ServerManager s = new ServerManager();
        // Connect();
        
        
    }
    
    
    
}
