import java.util.*;

public class Word_Pattern {
    public static void main(String[] args) {

    }

    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> letterToWord = new HashMap<Character, String>();
        HashMap<String, Character> wordToLetter = new HashMap<String, Character>();
        int index = 0;
        String[] sArr = str.split(" ");
        if (sArr.length != pattern.length())
            return false;
        for (String word : sArr) {
            Character letterAtIndex = pattern.charAt(index);
            String wordValue = letterToWord.get(letterAtIndex);
            Character letterValue = wordToLetter.get(word);
            if ((wordValue == null && letterValue != null) || (wordValue != null && letterValue == null)) {
                return false;
            } else if (wordValue == null && letterValue == null) {
                letterToWord.put(letterAtIndex, word);
                wordToLetter.put(word, letterAtIndex);
            } else if (wordValue.compareTo(word) != 0) {
                return false;
            } else if (letterValue != letterAtIndex) {
                return false;
            } else {

            }
            index++;
        }
        return true;
    }
}