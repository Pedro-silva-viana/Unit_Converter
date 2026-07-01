package com.example;

import io.github.cdimascio.dotenv.Dotenv;
import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class App{
    public static void main( String[] args ) throws Exception{
       Dotenv dotenv = Dotenv.load();
       String portText = dotenv.get("PORT");
       int port = Integer.parseInt(portText);

       HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

       server.start();
       System.out.println("Server is running on port: " + port);
    }
}
