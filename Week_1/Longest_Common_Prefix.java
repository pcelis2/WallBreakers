public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] test1 = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(test1));
        String[] test2 = { "dog", "racecar", "car" };
        System.out.println(longestCommonPrefix(test2));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length > 0) {
            String longestPrefix = strs[0];
            for (int i = 1; i < strs.length; i++) {
                StringBuilder stb = new StringBuilder();
                boolean done = false;
                for (int j = 0; j < strs[i].length() && j < longestPrefix.length() && !done; j++) {
                    if (strs[i].charAt(j) == longestPrefix.charAt(j)) {
                        stb.append(strs[i].charAt(j));
                    } else {
                        done = true;
                    }
                }
                longestPrefix = stb.toString();
                if (longestPrefix.length() == 0)
                    return "";
            }
            return longestPrefix;
        } else {
            return "";
        }
    }
}