import Data.ConsoleDataAcquirer;
import Data.FileDataAcquirer;
import Logic.ElementReplacer;
import Logic.RegexReplacer;
import view.ConsoleResultPrinter;
import view.FileDataPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileDataAcquirer fileDataAcquirer = new FileDataAcquirer();
        FileDataPrinter fileDataPrinter = new FileDataPrinter();
       /* FileDataPrinter fileDataInput = new FileDataPrinter();
        FileDataAcquirer fileDataOutput = new FileDataAcquirer();
        ElementReplacer elementReplacer = new ElementReplacer();
        RegexReplacer regexReplacer = new RegexReplacer();
        ConsoleDataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
        ConsoleResultPrinter consoleResultPrinter = new ConsoleResultPrinter();
        String word;
        word = consoleDataAcquirer.inputIn("Enter a message");
        word = elementReplacer.replaceElement(word);
        consoleResultPrinter.print(word);*/
        fileDataPrinter.print("Roman");
        String var = fileDataAcquirer.GetFromFile();
        System.out.print(var);
    }
}

