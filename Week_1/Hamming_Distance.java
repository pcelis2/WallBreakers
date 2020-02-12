public class Hamming_Distance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        String firstNumber = Integer.toBinaryString(x);
        String secondNumber = Integer.toBinaryString(y);
        int firstNumberPointer = firstNumber.length() - 1;
        int secondNumberPointer = secondNumber.length() - 1;
        int counter = 0;
        while (firstNumberPointer > -1 && secondNumberPointer > -1) {
            if (firstNumber.charAt(firstNumberPointer) != secondNumber.charAt(secondNumberPointer))
                counter++;
            firstNumberPointer--;
            secondNumberPointer--;

        }
        while (firstNumberPointer > -1) {
            if (firstNumber.charAt(firstNumberPointer) == '1')
                counter++;
            firstNumberPointer--;
        }
        while (secondNumberPointer > -1) {
            if (secondNumber.charAt(secondNumberPointer) == '1')
                counter++;
            secondNumberPointer--;
        }
        return counter;

    }
}