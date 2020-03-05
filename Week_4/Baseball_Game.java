import java.util.*;

public class Baseball_Game {
    public static void main(String[] args) {

    }

    public int calPoints(String[] ops) {
        Stack<String> validScores = new Stack<String>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].compareTo("C") == 0) {
                if (!validScores.isEmpty())
                    validScores.pop();
            } else if (ops[i].compareTo("D") == 0) {
                if (!validScores.isEmpty()) {
                    int lastValidScore = Integer.parseInt(validScores.peek());
                    lastValidScore += lastValidScore;
                    validScores.push(Integer.toString(lastValidScore));
                }

            } else if (ops[i].compareTo("+") == 0) {
                if (!validScores.isEmpty()) {
                    String firstPopString = validScores.pop();

                    if (!validScores.isEmpty()) {

                        int firstPop = Integer.parseInt(firstPopString);
                        int secondValue = Integer.parseInt(validScores.peek());
                        validScores.push(firstPopString);
                        validScores.push(Integer.toString((firstPop + secondValue)));

                    } else {
                        validScores.push(firstPopString);
                        validScores.push(firstPopString);
                    }
                }

            } else {
                validScores.push(ops[i]);

            }
        }

        int sum = 0;
        while (!validScores.isEmpty())
            sum += Integer.parseInt(validScores.pop());
        return sum;

    }
}