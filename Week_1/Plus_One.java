public class Plus_One {
    public static void main(String[] args) {

    }

    public static int[] plusOne(int[] digits) {
        int pointer = digits.length - 1;
        int lastNum = digits[pointer];
        lastNum++;
        int carry = 0;
        if (lastNum > 9) {
            carry = 1;
            lastNum = lastNum - 10;

        } else {
            carry = 0;
        }
        digits[pointer] = lastNum;
        pointer--;
        while (carry != 0 && pointer > -1) {
            lastNum = digits[pointer] + carry;
            if (lastNum > 9) {
                carry = 1;
                lastNum = lastNum - 10;
            } else {
                carry = 0;
            }
            digits[pointer] = lastNum;
            pointer--;
        }

        if (carry == 0)
            return digits;
        int[] myAnswer = new int[digits.length + 1];
        myAnswer[0] = carry;
        for (int i = 0; i < digits.length; i++) {
            myAnswer[i + 1] = digits[i];
        }
        return myAnswer;
    }
}