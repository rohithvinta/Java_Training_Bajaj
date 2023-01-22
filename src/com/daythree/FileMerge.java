package com.daythree;

import java.io.*;

public class FileMerge {
    public static void main(String[] args) {
        // File paths for the input and output files
        String file1 = "Textfile1.txt";
        String file2 = "Textfile2.txt";
        String outputFile = "README.txt";
        
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            
            // Read the first character from each file
            int c1 = reader1.read();
            int c2 = reader2.read();
            // Loop until we reach the end of both files
            while (c1 != -1 && c2 != -1) {
                // Write the first character from file1 to the output file
                writer.write(c1);
                
                // Write the first character from file2 to the output file
                writer.write(c2);
                
                // Read the next character from each file
                c1 = reader1.read();
                c2 = reader2.read();
            }
            
            // If one file is longer than the other, write the remaining characters
            while (c1 != -1) {
                writer.write(c1);
                c1 = reader1.read();
            }
            while (c2 != -1) {
                writer.write(c2);
                c2 = reader2.read();
            }
            
            System.out.println("File merge successful!");
        } catch (IOException e) {
            System.err.println("An error occurred while merging the files: " + e.getMessage());
        }
    }
}