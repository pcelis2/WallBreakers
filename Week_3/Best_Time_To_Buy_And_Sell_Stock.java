import java.util.*;

public class Best_Time_To_Buy_And_Sell_Stock {
    public static void main(String[] args) {
        final int size = 5;
        int[] testArray = // new int[size];
                // for (int i = 0; i < size; i++)
                // testArray[i] = (int) (Math.random() * 15);
                /* testArray= */ { 7, 1, 5, 3, 6, 4 };
        Best_Time_To_Buy_And_Sell_Stock myProgram = new Best_Time_To_Buy_And_Sell_Stock();
        myProgram.printArray(testArray);
        System.out.println(myProgram.maxProfit(testArray));
    }

    public void printArray(int[] testArray) {
        for (int i = 0; i < testArray.length - 1; i++)
            System.out.printf("%3d,", testArray[i]);

        System.out.printf("%3d\n", testArray[testArray.length - 1]);
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int maxGlobal = 0;
        int currentMin = prices[0];
        for (int i = 1; i < prices.length; i++) {
            currentMin = Math.min(currentMin, prices[i]);
            if (maxGlobal < prices[i] - currentMin)
                maxGlobal = prices[i] - currentMin;
        }
        return maxGlobal;
    }
}