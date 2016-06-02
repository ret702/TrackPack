package com.example.ret.myapplication;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by ret on 6/1/16.
 */
public class ClientSocket extends Thread {

    Socket clientSocket;


    ClientSocket(Socket socket)
    {
        this.clientSocket=socket;
    }

    @Override
    public void run()
    {
        try {
            InputStream in= clientSocket.getInputStream();
            OutputStream out = clientSocket.getOutputStream();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
