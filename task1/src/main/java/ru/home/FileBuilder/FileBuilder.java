package ru.home.FileBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileBuilder {
    public static void fileCheck(String text, String filePath, boolean ifExist) {
        if (!ifExist) {
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                byte[] buffer = text.getBytes();
                fos.write(buffer, 0, buffer.length);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
        public static String fileCreate(String filePath) {
        try {
            File myObj = new File(filePath);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return filePath;
    }
}