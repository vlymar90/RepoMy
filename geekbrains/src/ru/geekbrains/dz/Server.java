package ru.geekbrains.dz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    Scanner scanner = new Scanner(System.in);
    Socket socket = null;
    DataInputStream in;
    DataOutputStream out;

    Server() {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен!");
            socket = serverSocket.accept();
            System.out.println("Клиент подсоединился");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            inputMessage();
            outPutMessage();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inputMessage() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        String message = in.readUTF();
                        if (message.equals("end")) {
                            System.out.println("Клиент отключился от сервера!");
                           in.close();
                           out.close();
                           break;
                        }
                        else {
                            System.out.println(message);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void outPutMessage() {
        try {
            while (true) {
                String outputMessage = scanner.nextLine();
                out.writeUTF(outputMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


