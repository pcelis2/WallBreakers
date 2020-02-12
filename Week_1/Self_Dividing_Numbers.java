import java.util.*;

public class Self_Dividing_Numbers {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbers = new LinkedList<Integer>();

        return selfDividingNumbers;
    }
    // ****BruteForce Method */
    // public static List<Integer> selfDividingNumbers(int left, int right) {
    // List<Integer> selfDividingNumbers = new LinkedList<Integer>();
    // for (int i = 0; i <= right - left; i++) {
    // if (isSelfDividing(left + i)) {
    // selfDividingNumbers.add(left + i);
    // }
    // }
    // return selfDividingNumbers;
    // }

    // public static boolean isSelfDividing(int number) {
    // String str = String.valueOf(number);
    // for (int i = 0; i < str.length(); i++) {
    // int digit = Integer.parseInt(Character.toString(str.charAt(i)));
    // if (digit == 0 || number % digit != 0) {
    // return false;
    // }

    // }

    // return true;
    // }
}