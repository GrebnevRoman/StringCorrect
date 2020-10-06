package Logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexReplacerTest {
    RegexReplacer regexReplacer =new RegexReplacer();
    @Test
    public void shouldReplaceSymbolAtoO(){
        String word = "raman";
        Assertions.assertEquals("roman",regexReplacer.replaceWithRegex(word));
    }

}