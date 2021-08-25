// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    int max(int a, int b){

        if(a>=b){
            return a;
        } 
        
        return b;
    }

    public int solution(int[] A) {

        int maxProfit = 0;
        int tradeEarnings = 0;

        if(A.length == 0 || A.length == 1){
            return 0;
        }

        int lowestDay = A[0];

        for(int i = 1; i < A.length; i++){
            
            if( A[i] < lowestDay ){
                lowestDay = A[i];
            } else {
                tradeEarnings = A[i] - lowestDay;
                 maxProfit = max(maxProfit, tradeEarnings);
            }
        }

        return maxProfit;
    }
}
