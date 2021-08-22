// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public int[] prefixSum(int[] A){

        int[] prefixSum = new int[A.length +1];
        prefixSum[0]=0;

        for(int k=1; k < A.length+1; k++){
            prefixSum[k] = prefixSum[k-1]+A[k-1];
        }

        return prefixSum;
    }

    public int totalOfSlice(int[] P, int x, int y){
        return P[y+1]-P[x];
    }

    public double averageOfSlice(int[] P, int x, int y){
        return totalOfSlice( P, x, y)/(y-x+1.0);
    }

    public int solution(int[] A) {
        int[] prefixSumOfA = prefixSum(A);

        double smallerAverage = Integer.MAX_VALUE;
        double average;
        int indexOfSmallerAverage = 0;
        

        for(int i = 0; i < A.length; i++){
            for(int j = i+1; j < A.length; j++){

                average = averageOfSlice(prefixSumOfA, i, j);
                if( average < smallerAverage) {
                    smallerAverage = average;
                    indexOfSmallerAverage = i;
                }
            }
        }
        return indexOfSmallerAverage;
    }
}
