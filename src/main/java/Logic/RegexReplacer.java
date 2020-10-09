package Logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplacer {
    public String replaceWithRegex(String word) {
        Pattern pattern1 = Pattern.compile("r$");
        Matcher matcher1 = pattern1.matcher(word);
        if (!(matcher1.matches())) {
            Pattern pattern = Pattern.compile("ra");
            Matcher matcher = pattern.matcher(word);
            return matcher.replaceAll("ro");
        }else  return " Enter valid data";
       
    }
}
