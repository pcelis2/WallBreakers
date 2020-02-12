
import java.util.*;

public class Fizz_Buzz {
    public static void main(String[] args) {

    }

    public List<String> fizzBuzz(int n) {
        List<String> myList = new ArrayList<String>(n);
        for (Integer i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                myList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                myList.add("Fizz");
            } else if (i % 5 == 0) {
                myList.add("Buzz");
            } else {
                myList.add(i.toString());
            }
        }
        return myList;
    }
}