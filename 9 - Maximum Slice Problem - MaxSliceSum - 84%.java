// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    private int[] prefixSum(int[] A){

        int[] prefixSum = new int[A.length + 1];

        for(int k=1; k < prefixSum.length; k++){
            prefixSum[k] = prefixSum[k-1]+A[k-1];
        }

        return prefixSum;
    }

    private int sliceSum(int[] prefixSum, int x, int y){
        return prefixSum[y+1] - prefixSum[x];
    }

    public int solution(int[] A) {

        int maxSum = A[0];
        int[] prefixSum = prefixSum(A);

        for(int i = 0; i < A.length; i++){
            
            for(int j = i; j < A.length; j++){

                int sliceSum = sliceSum(prefixSum, i, j);
                if( sliceSum >  maxSum){
                    maxSum = sliceSum;
                }
            }
        }

        return maxSum;
    }
}
