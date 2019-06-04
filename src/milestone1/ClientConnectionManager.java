/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestone1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Ruan
 */
public class ClientConnectionManager {
    public PrintWriter output;
    public void ConnectToServ() throws IOException{
        Scanner scanner = new Scanner(System.in);
        
            Socket socket = new Socket("127.0.0.1",8080);
            output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            String inputString = input.readLine();
//            System.out.println(inputString);
            
                
                //String userInput = scanner.nextLine();
                
                
            
    }
    
    // al die is testing vir nou 
    // will net kan print op console
    public void ServerMessage(String uoutput){
//        output.println(uoutput);
    }
    
}
