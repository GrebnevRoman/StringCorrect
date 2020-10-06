import Data.ConsoleDataAcquirer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConsoleDataAcquirerTest {
    ConsoleDataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
    @Test
    public void shouldPutDataInVariable(){
        String variable = consoleDataAcquirer.inputIn("Enter a text");
        String sdad = "sdasd";
        Assertions.assertEquals(sdad,variable);
    }

}