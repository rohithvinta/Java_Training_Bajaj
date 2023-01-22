//Write a program to demonstrate the use of throws clause.Raise FileNotFoundException,IoException

package com.daythree;

import java.io.*;

public class ThrowsException {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("example.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
