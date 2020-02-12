public class Reverse_String {
    public static void main(String[] args) {
        char[] myChar = { 'h', 'e', 'l', 'l', 'o' };
        printArray(myChar);
        System.out.println();
        reverseString(myChar);
        printArray(myChar);

    }

    public static void reverseString(char[] s) {
        char t;
        for (int i = 0; i < s.length / 2; i++) {
            t = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = t;

        }
    }

    public static void printArray(char[] myChar) {
        for (char c : myChar)
            System.out.print(c + " ");
    }
}
