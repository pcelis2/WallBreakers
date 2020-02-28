import java.util.*;

public class Find_All_Anagrams_In_A_String {
    public static void main(String[] args) {

    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> myList = new LinkedList<Integer>();
        char[] pArray = p.toCharArray();
        Arrays.sort(pArray);
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            if (isAnagram(s.substring(i, i + p.length()).toCharArray(), pArray)) {
                myList.add(i);
            }
        }

        return myList;
    }

    // Assume that p is sorted
    public boolean isAnagram(char[] s, char[] p) {
        if (s.length != p.length) {
            System.out.println("What did you do?");
            return false;

        }
        Arrays.sort(s);
        for (int i = 0; i < s.length; i++)

        {
            if (s[i] != p[i])
                return false;
        }
        return true;
    }
}