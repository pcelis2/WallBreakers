public class Is_Subsequence {
    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;
        final int sSize = s.length();
        final int tSize = t.length();
        while (sPointer < sSize && tPointer < tSize) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
                tPointer++;
            } else {
                tPointer++;
            }
        }
        if (sPointer >= sSize)
            return true;
        return false;
    }
}