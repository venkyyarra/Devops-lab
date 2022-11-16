import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
   public static void main(String[] args) throws Exception {
      URL url = new URL("file:///C:/Users/staff/Desktop/sample%20webapp.html");
      BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
      String line;
      
      while ((line = reader.readLine()) != null) {
         System.out.println(line);
         writer.write(line);
         writer.newLine();
      }
      reader.close();
      writer.close();
   }
}<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html>
  <head>
    <title>Body bgcolor Attribute example</title>
  </head>
  <body bgcolor="#afafaf">
    <h1>This webpage has colored background.</h1>
  </body>
</html>