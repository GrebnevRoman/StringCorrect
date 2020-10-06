package Logic;

public class ElementReplacer {
    public String replaceElement(String text){
        String replaceText;

        int length = text.length();
        int indexOfR = text.indexOf("r");
        int indexOfGreatR = text.indexOf("R");
        int indexOfA = text.indexOf("a");
        if (!(indexOfR == (length - 2)) && (indexOfR == (indexOfA - 1) ||(indexOfGreatR == (indexOfA - 1) ))){
            replaceText = text.replace("ra" , "ro");
            return replaceText;
        }
        else return Integer.toString(indexOfR) + "\n " + Integer.toString(indexOfA);
    }
}
