package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import java.net.ServerSocket;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
       try{

        ServerSocket server = new ServerSocket(3000);
        Socket s =server.accept();

        System.out.println("client collegato");


        BufferedReader in= new BufferedReader(new InputStreamReader(s.getInputStream()));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        
        
        }
        catch(Exception e){

            
        }
    }
}
