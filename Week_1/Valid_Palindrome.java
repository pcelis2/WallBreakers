public class Valid_Palindrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String s) {

        int startPointer = 0;
        int endPointer = s.length() - 1;
        while (startPointer < s.length() && !Character.isLetterOrDigit(s.charAt(startPointer))) {
            startPointer++;
        }
        while (endPointer > -1 && !Character.isLetterOrDigit(s.charAt(endPointer))) {
            endPointer--;
        }

        while (startPointer < endPointer) {

            if (Character.toUpperCase(s.charAt(startPointer)) != Character.toUpperCase(s.charAt(endPointer))) {
                return false;
            } else {
                startPointer++;
                endPointer--;
            }

            while (startPointer < s.length() && !Character.isLetterOrDigit(s.charAt(startPointer))) {
                startPointer++;
            }
            while (endPointer > -1 && !Character.isLetterOrDigit(s.charAt(endPointer))) {
                endPointer--;
            }
        }

        return true;
    }
}