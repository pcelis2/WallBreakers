public class Excel_Sheet_Column_Number {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }

    public static int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += ((int) Math.pow(26, i)) * (s.charAt(s.length() - i - 1) - 64);

        }

        return sum;
    }
}