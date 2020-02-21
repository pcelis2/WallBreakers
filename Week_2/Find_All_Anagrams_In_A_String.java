import java.util.*;

public class Find_All_Anagrams_In_A_String {
    public static void main(String[] args) {
        Find_All_Anagrams_In_A_String myProgram = new Find_All_Anagrams_In_A_String();
        // System.out.println(myProgram.findAnagrams("cbaebabacd", "abc"));
        // System.out.println(myProgram.findAnagrams("aa", "bb"));
        System.out.println(myProgram.findAnagrams("abacbabc", "abc"));

        System.exit(0);
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> solutions = new LinkedList<Integer>();
        if (s.isEmpty() || p.isEmpty())
            return solutions;

        HashMap<Character, Integer> masterLetterAndOccurences = populateHashMap(p);
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            int index = indexAfterWrongCharacter(s.substring(i, i + p.length()), p, masterLetterAndOccurences);
            if (index <= 0) {
                i += index * -1;
                if (masterLetterAndOccurences.containsKey(s.charAt(i)))
                    i--;
            } else {
                solutions.add(i);
            }
        }
        return solutions;
    }

    // returns negative value if it is false that s is an anagram
    // the absolute value of that negative value is the index for
    // which the breaking point is
    // returns 1 if it is an anagram , therefore user has to just add one to their
    // pointer
    public int indexAfterWrongCharacter(String s, String p, HashMap<Character, Integer> master) {
        if (s.length() != p.length()) {
            return 0;
        }
        HashMap<Character, Integer> slaveKey = new HashMap<Character, Integer>(master);
        int lastRelevantIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer occurences = slaveKey.get(s.charAt(i));
            if (occurences == null) {
                return i * -1;
            } else if (occurences < 1) {
                return -1 * lastRelevantIndex;

            } else {
                lastRelevantIndex = i;
                slaveKey.replace(s.charAt(i), occurences, occurences - 1);
            }
        }
        return 1;
    }

    public HashMap<Character, Integer> populateHashMap(String str) {
        HashMap<Character, Integer> lettersAndOccurences = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            Integer occurences = lettersAndOccurences.get(str.charAt(i));
            if (occurences == null) {
                lettersAndOccurences.put(str.charAt(i), 1);
            } else {
                lettersAndOccurences.put(str.charAt(i), occurences + 1);
            }
        }
        return lettersAndOccurences;
    }
}