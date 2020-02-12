public class Binary_Gap {
    public static void main(String[] args) {
        System.out.println(binaryGap(15));
    }

    public static int binaryGap(int N) {
        String binaryCode = Integer.toBinaryString(N);
        int maxGap = 0;
        int tempDistance = 0;
        int pointer = 0;
        boolean trigger = false;
        while (pointer < binaryCode.length()) {
            if (binaryCode.charAt(pointer) == '1') {
                if (trigger == true) {
                    tempDistance++;
                    if (tempDistance > maxGap) {
                        maxGap = tempDistance;

                    }
                    tempDistance = 0;
                }
                trigger = true;

            } else {
                if (trigger)
                    tempDistance++;
            }
            pointer++;
        }
        return maxGap;
    }
}