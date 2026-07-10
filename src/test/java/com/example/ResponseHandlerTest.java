package com.example;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;
import com.sun.net.httpserver.HttpExchange;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;

public class ResponseHandlerTest {
    @Test
    public void testProcessTemplateLength() throws Exception {
        ResponseHandler handler = new ResponseHandler();
        HttpExchange exchangeMock = mock(HttpExchange.class);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        
        when(exchangeMock.getResponseBody()).thenReturn(output);
        when(exchangeMock.getRequestURI()).thenReturn(URI.create("http://localhost/questionL?valor=1&from=m&to=cm"));
        
        String htmlTemplate = "Tabs: {{currentTab}} | activeL: {{activeLength}} | {{question}} -> {{response}}";
        InputStream fakeHtml = new ByteArrayInputStream(htmlTemplate.getBytes());

        handler.processTemplate(fakeHtml, exchangeMock);
        verify(exchangeMock).sendResponseHeaders(eq(200), anyLong());
        String finalResult = output.toString();
        
        assertTrue(finalResult.contains("Tabs: length"));
        assertTrue(finalResult.contains("activeL: active"));
        assertTrue(finalResult.contains("1m")); 
        assertTrue(finalResult.contains("100.0cm")); 
    }
    @Test
    public void testProcessTemplateWithInvalidQuery() throws Exception {
        ResponseHandler handler = new ResponseHandler();
        
        HttpExchange exchangeMock = mock(HttpExchange.class);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        
        when(exchangeMock.getResponseBody()).thenReturn(output);
        when(exchangeMock.getRequestURI()).thenReturn(URI.create("http://localhost/questionL?valor=&from=&to="));
        
        String htmlTemplate = "Error code: {{question}} -> {{response}}";
        InputStream fakeHtml = new ByteArrayInputStream(htmlTemplate.getBytes());

        handler.processTemplate(fakeHtml, exchangeMock);

        String finalResult = output.toString();
        assertTrue(finalResult.contains(":-[")); 
    }
}
