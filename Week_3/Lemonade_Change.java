public class Lemonade_Change {
    public static void main(String[] args) {

    }

    public boolean lemonadeChange(int[] bills) {
        int[] register = new int[3];// {5's, 10's, 20's}
        for (int i = 0; i < bills.length; i++) {
            int constumerPayment = bills[i];
            int index = (int) (Math.log(constumerPayment / 5) / Math.log(2));
            register[index] = register[index] + 1;
            int change = constumerPayment - 5;
            boolean stopLooking = false;
            for (int j = register.length - 1; j > -1 && !stopLooking; j--) {
                boolean done = false;
                int bill = 5 * (int) Math.pow(2, j);
                while (!done) {
                    if (change == 0 || register[j] < 1 || bill > change) {
                        if (change == 0)
                            stopLooking = true;
                        done = true;
                    } else {
                        register[j] = register[j] - 1;
                        change -= bill;
                    }
                }
            }
            if (change != 0)
                return false;
        }

        return true;
    }
}