import java.util.*;

public class Implement_Queue_Using_Stack {
    public static void main(String[] args) {

    }

    class MyQueue {

        /** Initialize your data structure here. */
        Stack<Integer> myStack;

        public MyQueue() {
            myStack = new Stack<Integer>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            Stack<Integer> tempStack = new Stack<Integer>();
            while (!myStack.isEmpty()) {
                tempStack.push(myStack.pop());
            }
            myStack.push(x);
            while (!tempStack.isEmpty()) {
                myStack.push(tempStack.pop());
            }
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return myStack.pop();
        }

        /** Get the front element. */
        public int peek() {
            return myStack.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return myStack.isEmpty();
        }
    }

    /**
     * Your MyQueue object will be instantiated and called as such: MyQueue obj =
     * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
     * obj.peek(); boolean param_4 = obj.empty();
     */
}