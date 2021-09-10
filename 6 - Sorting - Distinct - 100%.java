// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 0){
            return 0;
        }

        int differentNumbers = 1;
        Arrays.sort(A);
        for(int i = 1; i< A.length; i++){
            if(A[i]!=A[i-1]){
                differentNumbers++;
            }
        }

        return differentNumbers;
    }
}
