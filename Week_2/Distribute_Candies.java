
//import java.util.HashMap;
import java.util.HashSet;

public class Distribute_Candies {
    public static void main(String[] args) {

    }

    public int distributeCandies(int[] candies) {

        HashSet<Integer> candyInventory = new HashSet<Integer>();
        for (int i = 0; i < candies.length; i++) {
            candyInventory.add(candies[i]);
        }
        if (candies.length / 2 > candyInventory.size())
            return candyInventory.size();
        return candies.length / 2;

        // solution1
        /**
         * After looking at the hints, I realized that a map does not tell me anything
         * infact the most important part is the last three lines of the code That is,
         * the upper limit of the amount of candy vs different types of candies
         */
        // HashMap<Integer, Integer> candyInventory = new HashMap<Integer, Integer>();

        // for (int i = 0; i < candies.length; i++) {
        // Integer amount = candyInventory.get(candies[i]);
        // if (amount == null) {
        // candyInventory.put(candies[i], 1);
        // } else {
        // candyInventory.replace(candies[i], amount, amount + 1);
        // }
        // }
        // if (candies.length / 2 > candyInventory.size())
        // return candyInventory.size();
        // return candies.length / 2;

    }
}