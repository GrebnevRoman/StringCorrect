package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataPrinter implements ResultPrinter {
    final String FILE = "file.txt";
    @Override
    public void print(String text) {
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(new File(FILE)))) {
            writer.write(text);
            writer.flush();
        } catch (IOException io) {
            System.out.print("Exception");
        }
    }
}
