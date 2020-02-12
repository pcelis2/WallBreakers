public class Reverse_Words_In_A_String_III {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));

    }

    public static String reverseWords(String s) {
        StringBuilder stb = new StringBuilder();
        int firstPointer = 0;
        int secondPointer = 0;
        int pointerOfFirstLetterOfWord = 0;
        while (firstPointer < s.length()) {
            while (secondPointer < s.length() && s.charAt(secondPointer) != ' ') {
                secondPointer++;
            }
            pointerOfFirstLetterOfWord = secondPointer + 1;
            if (secondPointer != s.length() - 1)
                secondPointer--;

            System.out.println(firstPointer);
            System.out.println(secondPointer);
            while (firstPointer <= secondPointer) {
                stb.append(s.charAt(secondPointer--));
            }
            if (pointerOfFirstLetterOfWord < s.length())
                stb.append(" ");
            firstPointer = pointerOfFirstLetterOfWord;
            secondPointer = firstPointer;
        }

        return stb.toString();
    }

}