import java.util.HashSet;
import java.util.LinkedList;

public class Intersection_Of_Two_Arrays
{
    public static void main(String[] args) {
        Intersection_Of_Two_Arrays myProgram = new Intersection_Of_Two_Arrays();
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> myNumbers = new HashSet<Integer>();
        HashSet<Integer> inMySolution = new HashSet<Integer>();
        int [] arrayToHash;
        int [] arrayToGoThrough;
        if(nums1.length < nums2.length)
        {
            arrayToHash = nums1;
            arrayToGoThrough = nums2;
        }
        else
        {
            arrayToHash = nums2;
            arrayToGoThrough = nums1;
        }
        for(Integer I: arrayToHash)
            myNumbers.add(I);
        
        for(int i =0; i < arrayToGoThrough.length; i++)
        {
            if(myNumbers.contains(arrayToGoThrough[i]))
                inMySolution.add(arrayToGoThrough[i]);
        }
        int [] finalSolution = new int [inMySolution.size()];
        int count =0;
        for(Integer I: inMySolution)
        {
            finalSolution[count++] = I;
        }
        return finalSolution;

    }
}