import java.util.*;

public class Assign_Cookies {
    public static void main(String[] args) {
        int size = 10;
        int[] myArr = new int[size];
        for (int i = 0; i < size; i++)
            myArr[i] = (int) (Math.random() * 100);
        Assign_Cookies myProg = new Assign_Cookies();
        myProg.findContentChildren(myArr, myArr);

    }

    public int findContentChildren(int[] g, int[] s) {
        int happyChildren = 0;
        if (g.length == 0 || s.length == 0)
            return 0;
        PriorityQueue<Integer> children = new PriorityQueue<Integer>(g.length, Collections.reverseOrder());
        PriorityQueue<Integer> cookies = new PriorityQueue<>(s.length, Collections.reverseOrder());
        int pointer = 0;
        while (pointer < g.length && pointer < s.length) {
            children.add(g[pointer]);
            cookies.add(s[pointer]);
            pointer++;
        }
        int gPointer = pointer, sPonter = pointer;

        while (gPointer < g.length) {
            children.add(g[gPointer++]);

        }
        while (sPonter < s.length) {
            cookies.add(s[sPonter++]);
        }
        int childsWant = -1;
        int cookieSize = -1;
        while (!children.isEmpty() && !cookies.isEmpty()) {
            if (childsWant < 0)
                childsWant = children.poll();
            if (cookieSize < 0)
                cookieSize = cookies.poll();
            if (childsWant <= cookieSize) {
                happyChildren++;
                childsWant = -1;
                cookieSize = -1;
            } else {
                childsWant = -1;
            }
        }
        while (!children.isEmpty() && cookieSize > 0) {
            if (childsWant < 0)
                childsWant = children.poll();
            if (childsWant <= cookieSize) {
                happyChildren++;
                childsWant = -1;
                cookieSize = -1;
            } else {
                childsWant = -1;
            }

        }

        return happyChildren;
    }
}
