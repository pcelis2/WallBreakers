public class Number_Complement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    public static int findComplement(int num) {
        String byteCode = Integer.toBinaryString(num);
        StringBuilder stb = new StringBuilder(byteCode.length());
        boolean trigger = false;
        int pointer = 0;
        while (pointer < byteCode.length()) {
            if (!trigger) {
                if (byteCode.charAt(pointer) != '0') {
                    trigger = true;
                    stb.append("0");
                } else {
                    stb.append("0");
                }
                pointer++;
            } else {
                if (byteCode.charAt(pointer) == '0') {
                    stb.append("1");
                } else {
                    stb.append("0");
                }
                pointer++;
            }
        }
        return Integer.parseInt(stb.toString(), 2);

    }
}