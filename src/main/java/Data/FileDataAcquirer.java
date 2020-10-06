package Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class FileDataAcquirer {


    public String GetFromFile() {
        String FILE_NAME = "file.txt";
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        } catch (IOException ioException) {
            System.out.print("Error");
        }

        return stringBuilder.toString();
    }
}