package com.example;

import io.github.cdimascio.dotenv.Dotenv;
import com.sun.net.httpserver.HttpServer;
import java.io.InputStream;
import java.net.InetSocketAddress;

public class App{
    public static void main( String[] args ) throws Exception{
       Dotenv dotenv = Dotenv.load();
       String portText = dotenv.get("PORT");
       int port = Integer.parseInt(portText);
       ResponseHandler responseHandler = new ResponseHandler();
       
       HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

       server.createContext("/", exchange -> {
        String request = exchange.getRequestURI().getPath();
        System.out.println(request);

        switch (request) {
            case "/":{
                InputStream pageHTML = App.class.getResourceAsStream("/static/length.html");
                responseHandler.processStatic(pageHTML, exchange);
                break;
            }
            case "/style.css":{
                InputStream styleCSS = App.class.getResourceAsStream("/static/style.css");
                responseHandler.processStatic(styleCSS, exchange);
                break;
            }
            case "/length":{
                InputStream pageHTML = App.class.getResourceAsStream("/static/length.html");
                responseHandler.processStatic(pageHTML, exchange);
                break;
            }
            case "/temperature":{
                InputStream pageHTML = App.class.getResourceAsStream("/static/temperature.html");
                responseHandler.processStatic(pageHTML, exchange);
                break;
            }
            case "/weight":{
                InputStream pageHTML = App.class.getResourceAsStream("/static/weight.html");
                responseHandler.processStatic(pageHTML, exchange);
                break;
            }
            case "/questionL":{
                InputStream pageHTML = App.class.getResourceAsStream("/templates/response.html");
                responseHandler.processTemplate(pageHTML, exchange);
                break;
            }
            case "/questionT":{
                InputStream pageHTML = App.class.getResourceAsStream("/templates/response.html");
                responseHandler.processTemplate(pageHTML, exchange);
                break;
            }
            case "/questionW":{
                InputStream pageHTML = App.class.getResourceAsStream("/templates/response.html");
                responseHandler.processTemplate(pageHTML, exchange);
                break;
            }
            default:{
                break;
            }
        }
       });

       server.start();
       System.out.println("Server is running on port: " + port);
    }
}
