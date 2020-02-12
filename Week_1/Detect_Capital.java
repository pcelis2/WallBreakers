public class Detect_Capital {
    public static void main(String[] args) {

    }

    public static boolean detectCapitalUse(String word) {
        int state = 0;
        /**
         * 0 = all lowercase, 1 = all higher cases, 2 = First has to be higher case
         */
        if (word.length() == 0 || word.length() == 1)
            return true;
        int pointer = 0;
        state = Character.isUpperCase(word.charAt(pointer++)) ? 1 : 0;
        if (state == 0) {
            while (pointer < word.length()) {
                if (Character.isUpperCase(word.charAt(pointer)))
                    return false;
                pointer++;
            }
        } else {

            state = Character.isUpperCase(word.charAt(pointer++)) ? 1 : 2;
            if (state == 1) {
                while (pointer < word.length()) {
                    if (!Character.isUpperCase(word.charAt(pointer)))
                        return false;
                    pointer++;
                }
            } else {
                while (pointer < word.length()) {
                    if (Character.isUpperCase(word.charAt(pointer)))
                        return false;
                    pointer++;
                }
            }
        }

        return true;
    }
}