import java.util.*;

public class Course_Schedule {
    public static void main(String[] args) {

    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        HashMap<Integer, LinkedList<Integer>> courseAndPreq = fillCourseAndPreq(prerequisites);
        HashSet<Integer> visitedNodes = new HashSet<Integer>();
        for (Map.Entry<Integer, LinkedList<Integer>> entry : courseAndPreq.entrySet()) {

            if (!noLoop(courseAndPreq, visitedNodes, entry.getKey()))
                return false;

        }
        return true;
    }

    public boolean noLoop(HashMap<Integer, LinkedList<Integer>> courseAndPreq, HashSet<Integer> visitedNodes,
            Integer courseNumber) {
        for (Integer preReqCourse : courseAndPreq.get(courseNumber)) {
            if (visitedNodes.contains(preReqCourse))
                return false;
            noLoop(courseAndPreq, visitedNodes, preReqCourse);
        }
        return true;
    }

    public HashMap<Integer, LinkedList<Integer>> fillCourseAndPreq(int[][] prerequisites) {

        HashMap<Integer, LinkedList<Integer>> courseAndPreq = new HashMap<Integer, LinkedList<Integer>>();
        for (int i = 0; i < prerequisites.length; i++) {
            LinkedList<Integer> preReqs = courseAndPreq.get(prerequisites[i][0]);
            // For course number
            if (preReqs == null) {
                preReqs = new LinkedList<Integer>();
                preReqs.add(prerequisites[i][1]);
                courseAndPreq.put(prerequisites[i][0], preReqs);
            } else {
                preReqs.add(prerequisites[i][1]);
            }
            // For preReq course
            preReqs = courseAndPreq.get(prerequisites[i][1]);
            if (preReqs == null) {
                LinkedList<Integer> temp = new LinkedList<Integer>();
                courseAndPreq.put(prerequisites[i][1], temp);
            }

        }
        return courseAndPreq;
    }

}