package com.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

// CXF REST Client Invoking POST Method

public class PostAddIntegersClient {

  public static void main(String[] args) {
    try {
      URL url = new URL("http://localhost:8080/StudentWebServiceREST_Server/rest/addIntegers");
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setDoOutput(true);
      conn.setRequestMethod("POST");
      conn.setRequestProperty("Content-Type", "application/json");

      String input = "2,4";
      //int a = 2;
      //int b = 4;

      OutputStream os = conn.getOutputStream();
      os.write(input.getBytes());
      os.flush();

      Scanner scanner;
      String response;
      if (conn.getResponseCode() != 200) {
        scanner = new Scanner(conn.getErrorStream());
        response = "Error From Server \n\n";
      } else {
        scanner = new Scanner(conn.getInputStream());
        response = "Response From Server \n\n";
      }
      scanner.useDelimiter("\\Z");
      System.out.println(response + scanner.next());
      scanner.close();
      conn.disconnect();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}