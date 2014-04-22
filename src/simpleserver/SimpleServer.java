package simpleserver;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    static ServerSocket serverSocket;
    static Socket socket;
    static DataOutputStream out;

    public static void main(String[] args) throws IOException {
        System.out.println("starting server...");
        serverSocket = new ServerSocket(7777);
        System.out.println("server started");
        socket = serverSocket.accept();
        System.out.println("connection from:" + socket.getInetAddress());
        out = new DataOutputStream(socket.getOutputStream());
        out.writeUTF("This is a test of Java sockets, message from server.Your IP is "+socket.getInetAddress());
        System.out.println("Data has been sent successfully");
    }
}
