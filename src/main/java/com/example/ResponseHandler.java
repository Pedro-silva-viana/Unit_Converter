package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;

public class ResponseHandler {
    private void sendBytes(byte[] content, HttpExchange exchange){
        String request = exchange.getRequestURI().getPath();

        try{
            exchange.sendResponseHeaders(200, content.length);

            OutputStream exit = exchange.getResponseBody();
            exit.write(content);
            exit.close();
        } catch (IOException e){
            System.err.println("[ERROR] Failed to process and send HTML template for tab:" + request);
            e.printStackTrace();
        }
    }

    public void processStatic(InputStream template, HttpExchange exchange) throws IOException{
        byte[] contenTemplate = template.readAllBytes();
        sendBytes(contenTemplate, exchange);
    }

    public void processStatic(String html, HttpExchange exchange) throws IOException{
        byte[] content = html.getBytes();
        sendBytes(content, exchange);
    }

    private String templateRenderer(String html, double response, String inputValue, String fromUnit, String toUnit, String request){
        html = html.replace("{{response}}", response + toUnit);
        html = html.replace("{{question}}", inputValue + fromUnit);

        switch (request) {
            case "/questionL":{
                html = html.replace("{{currentTab}}", "length");
                html = html.replace("{{activeLength}}", "active");
                html = html.replace("{{activeTemperature}}", "");
                html = html.replace("{{activeWeight}}", "");
                break;
            }
            case "/questionT":{
                html = html.replace("{{currentTab}}", "temperature");
                html = html.replace("{{activeLength}}", "");
                html = html.replace("{{activeTemperature}}", "active");
                html = html.replace("{{activeWeight}}", "");
                break;
            }
            case "/questionW":{
                html = html.replace("{{currentTab}}", "weight");
                html = html.replace("{{activeLength}}", "");
                html = html.replace("{{activeTemperature}}", "");
                html = html.replace("{{activeWeight}}", "active");
                break;
            }
            default:
                break;
            }

        return html;

    }

    public void processTemplate(InputStream template, HttpExchange exchange) throws IOException{
        String request = exchange.getRequestURI().getPath();
        String query = exchange.getRequestURI().getQuery();
        String[] pairs = query.split("&");
        String[] inputValue = pairs[0].split("=");
        String[] fromUnit = pairs[1].split("=");
        String[] toUnit = pairs[2].split("=");
        String html = new String(template.readAllBytes());

        if(inputValue.length < 2 || fromUnit.length < 2 || toUnit.length < 2){
            html = templateRenderer(html, 0, ":-[", "", " :-[", request);
            processStatic(html, exchange);
            return;
        }

        double inputDouble = Double.parseDouble(inputValue[1]);
        double response = 0;

        switch (request){
           case "/questionL":
                response = LengthConverter.lengthConvert(inputDouble, fromUnit[1], toUnit[1]);
                break;
            case "/questionT":
                response = TemperatureConverter.temperatureConvert(inputDouble, fromUnit[1], toUnit[1]);
                break;
            case "/questionW":
                response = WeightConverter.weightConvert(inputDouble, fromUnit[1], toUnit[1]);
                break;
            default:
                break;
        }
        html = templateRenderer(html, response, inputValue[1], fromUnit[1], toUnit[1], request);
        processStatic(html, exchange);
            
    }
}
