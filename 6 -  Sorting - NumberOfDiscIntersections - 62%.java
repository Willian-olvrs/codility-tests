
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    private int countIntersectionsToTheLeft(int[] A, int k){

        int intersections=0;

        for(int i=0; i < k; i++){

            if(A[i] >= k-i || A[k] >= k-i || A[i] + A[k] >= k-i ){ // overflow fix
                intersections++;
            }
        }
        return intersections;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8

        int intersections = 0;

        for(int k=A.length-1; k >= 0; k--){
            int intersectionsToTheLeft = countIntersectionsToTheLeft(A, k);

            intersections = intersections + intersectionsToTheLeft;
            
            if(intersections > 10000000){ // hard limit fix
                return -1;
            }
        }

        return intersections;
    }
}
