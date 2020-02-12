public class Reverse_Vowels_Of_A_String {
    public static void main(String[] args) {
        System.out.println(reverseVowels("LeetCode"));
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {

        char[] myString = s.toCharArray();
        int firstPointer = 0;
        int secondPointer = myString.length - 1;

        while (firstPointer < secondPointer) {
            while (firstPointer < secondPointer && !isVowel(myString[firstPointer])) {
                firstPointer++;
            }
            while (firstPointer < secondPointer && !isVowel(myString[secondPointer])) {
                secondPointer--;
            }
            if (firstPointer < secondPointer) {
                char temp = myString[firstPointer];
                myString[firstPointer] = myString[secondPointer];
                myString[secondPointer] = temp;
            }
            firstPointer++;
            secondPointer--;
        }

        return new String(myString);

        // This is a solutoin that iterates the string and switches the vowels. I didn't
        // understand the quetion OMG
        // char[] str = s.toCharArray();
        // int firstPointer = 0;
        // int secondPointer = 0;
        // while (firstPointer < str.length) {
        // if (isVowel(str[firstPointer])) {
        // secondPointer = findNextVowel(str, firstPointer + 1);
        // if (secondPointer < 0)
        // return new String(str);

        // if (str[firstPointer] != str[secondPointer]) {
        // char temp = str[firstPointer];
        // str[firstPointer] = str[secondPointer];
        // str[secondPointer] = temp;
        // }
        // firstPointer = secondPointer;
        // } else {
        // firstPointer++;
        // }
        // }

        // return new String(str);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || Character.toLowerCase(c) == 'a'
                || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o'
                || Character.toLowerCase(c) == 'u';
    }
}