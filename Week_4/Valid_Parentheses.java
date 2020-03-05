import java.util.*;

public class Valid_Parentheses {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        Stack<Character> myEqu = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                myEqu.push(s.charAt(i));
            } else {
                if (s.charAt(i) == ')' && (myEqu.isEmpty() || myEqu.pop() != '(')) {
                    return false;
                } else if (s.charAt(i) == ']' && (myEqu.isEmpty() || myEqu.pop() != '[')) {
                    return false;
                } else if (s.charAt(i) == '}' && (myEqu.isEmpty() || myEqu.pop() != '{')) {
                    return false;
                } else {

                }
            }
        }
        if (myEqu.isEmpty())
            return true;
        return false;
    }
}