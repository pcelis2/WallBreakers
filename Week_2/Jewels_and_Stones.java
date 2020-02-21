import java.util.HashMap;
import java.util.HashSet;

public class Jewels_and_Stones {
    public static void main(String[] args) {

    }

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        HashSet<Character> mySet = new HashSet<Character>(J.length());
        for (int i = 0; i < J.length(); i++) {
            mySet.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (mySet.contains(S.charAt(i)))
                count++;
        }

        return count;
    }
}