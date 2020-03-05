import java.util.*;

public class Score_Of_Parentheses {
    public static void main(String[] args) {

    }

    public int scoreOfParentheses(String S) {
        Stack<String> myLeftHandParentheses = new Stack<String>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == ')') {
                // if (!myLeftHandParentheses.isEmpty()) {
                // myLeftHandParentheses.pop();
                // score++;
                // } else {
                String value = myLeftHandParentheses.pop();
                if (value.compareTo("(") == 0) {
                    myLeftHandParentheses.push("1");
                } else {

                    // LinkedList<String> numbers = new LinkedList<String>();
                    int sum = 0;
                    while (value.compareTo("(") != 0) {
                        sum += Integer.parseInt(value);
                        value = myLeftHandParentheses.pop();
                    }
                    sum = sum * 2;
                    myLeftHandParentheses.push(Integer.toString(sum));

                }
                // }

            } else if (S.charAt(i) == '(') {
                myLeftHandParentheses.push("(");
            } else {
                // continue.
            }
        }
        int score = 0;
        while (!myLeftHandParentheses.isEmpty())
            score += Integer.parseInt(myLeftHandParentheses.pop());
        return score;
    }
}