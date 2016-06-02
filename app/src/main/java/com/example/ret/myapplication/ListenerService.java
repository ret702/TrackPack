package com.example.ret.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

public class ListenerService extends Service {
    public ListenerService() {
        startSocket();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }

    private void startSocket()
    {
        try {
            ArrayList<ClientSocket> clientSockets= new ArrayList<>();
            ServerSocket serverSocket = new ServerSocket(2016);
            while(true)
            {
                clientSockets.add(new ClientSocket(serverSocket.accept()));
            }
        }
        catch(IOException ex)
        {

        }
    }
}
