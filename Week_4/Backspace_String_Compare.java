import java.util.*;

public class Backspace_String_Compare {
    public static void main(String[] args) {

    }

    public boolean backspaceCompare(String S, String T) {

        String sParse = getActualString(S);
        String tParse = getActualString(T);
        return sParse.compareTo(tParse) == 0;
    }

    public String getActualString(String str) {
        Stack<Character> stackOfFinalLetters = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (!stackOfFinalLetters.isEmpty())
                    stackOfFinalLetters.pop();
            } else {
                stackOfFinalLetters.push(str.charAt(i));
            }
        }
        StringBuilder strB = new StringBuilder();
        while (!stackOfFinalLetters.isEmpty())
            strB.append(stackOfFinalLetters.pop());
        return strB.toString();

    }
}