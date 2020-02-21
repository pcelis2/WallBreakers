import java.util.*;

public class Uncommon_Words_From_Two_Sentences {
    public static void main(String[] args) {

    }

    public String[] uncommonFromSentences(String A, String B) {
        HashSet<String> common = new HashSet<String>();
        HashSet<String> uncommon = new HashSet<String>();
        for (String S : A.split(" ")) {
            if (!common.contains(S)) {
                if (uncommon.contains(S)) {
                    uncommon.remove(S);
                    common.add(S);
                } else {
                    uncommon.add(S);
                }
            }

        }
        for (String S : B.split(" ")) {
            if (!common.contains(S)) {
                if (uncommon.contains(S)) {
                    uncommon.remove(S);
                    common.add(S);
                } else {
                    uncommon.add(S);
                }
            }

        }
        String[] uncommmonWords = new String[uncommon.size()];
        int count = 0;
        for (String S : uncommon) {
            uncommmonWords[count] = S;
            count++;
        }

        return uncommmonWords;
    }
}