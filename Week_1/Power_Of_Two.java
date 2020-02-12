public class Power_Of_Two {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));

    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 2 != 0) {
            return false;
        } else {
            return isPowerOfTwo(n / 2);
        }
    }
}