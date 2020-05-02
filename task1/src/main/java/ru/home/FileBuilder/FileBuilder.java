package ru.home.FileBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileBuilder {
    public static void fileCheck(String text, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeUsingOutputStream(String data) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File("C:/Users/Kirill/Desktop/test.txt"));
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // пишем в файл с помощью Files
    public static void writeUsingFiles(String data) {
        try {
            Files.write(Paths.get("C:/Users/Kirill/Desktop/test.txt"), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // пишем в файл с помощью BufferedWriterC:\Users\Kirill\Desktop\Диплом\TESTproject\src\main\resources\templates
    public static void writeUsingBufferedWriter(String data, int noOfLines) {
        File file = new File("C:/Users/Kirill/Desktop/test.txt");
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine = data + System.getProperty("line.separator");
        try {
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for (int i = noOfLines; i > 0; i--) {
                br.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    // пишем в файл с помощью FileWriter
    public static void writeUsingFileWriter(String data, String filePath) {
        File file = new File(filePath);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}