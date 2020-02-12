import java.util.HashMap;

public class Valid_Anagram {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] letterOccurences = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letterOccurences[s.charAt(i) - 97]++;
            letterOccurences[t.charAt(i) - 97]--;
        }
        for (int i = 0; i < letterOccurences.length; i++) {
            if (letterOccurences[i] != 0)
                return false;
        }
        return true;
    }
}