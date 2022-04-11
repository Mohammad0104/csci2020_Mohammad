package com.example.lab10;

import java.io.*;
import java.net.*;




public class BulletinHandlerBoard implements Runnable {
    private Socket socket;
    private DataOutputStream out;
    public String message;

    public BulletinHandlerBoard(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(inputStream));
            OutputStream outputStream = socket.getOutputStream();
            out = new DataOutputStream(outputStream);
            while ((message = in.readLine()) != null){
                System.out.println(message);
                FileWriter fw = extracted();
                fw.write(message);
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private FileWriter extracted() throws IOException {
        return new FileWriter("messages.txt");
    }
}