package view;

import Data.FileDataAcquirer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FileDataPrinterTest {
    FileDataPrinter fileDataPrinter = new FileDataPrinter();
    FileDataAcquirer fileDataAcquirer = new FileDataAcquirer();

    @Test
    void shouldPrintDataInFile() {
        fileDataPrinter.print("Roman");
        String var = fileDataAcquirer.GetFromFile();
        Assertions.assertEquals("Roman",var);
    }
}