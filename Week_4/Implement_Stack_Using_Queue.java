import java.util.*;

public class Implement_Stack_Using_Queue {
    public static void main(String[] args) {

    }

    class MyStack {

        /** Initialize your data structure here. */
        Queue<Integer> myQueue;

        public MyStack() {
            myQueue = new LinkedList<Integer>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            Queue<Integer> tempQueue = new LinkedList<Integer>();
            while (!myQueue.isEmpty()) {
                tempQueue.add(myQueue.remove());
            }
            myQueue.add(x);
            while (!tempQueue.isEmpty()) {
                myQueue.add(tempQueue.remove());
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return myQueue.remove();
        }

        /** Get the top element. */
        public int top() {
            return myQueue.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return myQueue.isEmpty();
        }
    }

    /**
     * Your MyStack object will be instantiated and called as such: MyStack obj =
     * new MyStack(); obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
}