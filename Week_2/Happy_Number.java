import java.util.HashSet;
import java.util.LinkedList;

public class Happy_Number {
    public static void main(String[] args) {
        Happy_Number myProgram = new Happy_Number();

    }

    public boolean isHappy(int n) {
        HashSet<Integer> setOfPreviousValues = new HashSet<Integer>();
        int previousValue = n;
        while (!setOfPreviousValues.contains(previousValue)) {
            int currentValue = 0;
            setOfPreviousValues.add(previousValue);
            for (Integer digit : extractNumbers(previousValue)) {
                currentValue += digit * digit;
            }
            if (currentValue == 1)
                return true;
            previousValue = currentValue;

        }
        return false;

    }

    public LinkedList<Integer> extractNumbers(int n) {
        LinkedList<Integer> singleDigits = new LinkedList<Integer>();
        // brute force way
        String myNumber = Integer.toString(n);
        for (int i = 0; i < myNumber.length(); i++) {
            singleDigits.add(myNumber.charAt(i) - 48);
        }
        // This logic needs work.
        // int myPower =1;
        // while(n > myPower/10)
        // {
        // myPower=myPower*10;
        // }
        // while(myPower >0)
        // {
        // int tempValue = n%(myPower*10);
        // tempValue = tempValue/myPower;
        // singleDigits.add(tempValue);
        // myPower = myPower/10;
        // }
        return singleDigits;
    }

}