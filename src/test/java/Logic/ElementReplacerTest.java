package Logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementReplacerTest {
    ElementReplacer elementReplacer = new ElementReplacer();
    @Test
    public void shouldReplaceElementWithString(){
        String word = "raman";
        Assertions.assertEquals("roman",elementReplacer.replaceElement(word));
    }

}