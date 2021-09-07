// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    private int gcb(int a, int b){

        if(a % b == 0){
            return b;
        }

        return gcb(b, a%b);
    }
    
    public int solution(int N, int M) {
        // write your code in Java SE 8

        return N/gcb(N, M);
   }
}
