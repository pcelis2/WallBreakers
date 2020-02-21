import java.util.HashSet;

public class Unique_Morse_Code_Words {
    public static void main(String[] args) {

    }

    public int uniqueMorseRepresentations(String[] words) {
        int count = 0;
        String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        HashSet<String> mySet = new HashSet<String>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder stb = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                stb.append(morseCode[words[i].charAt(j) - 97]);
            }
            if (mySet.add(stb.toString()))
                count++;
        }
        return count;
    }
}