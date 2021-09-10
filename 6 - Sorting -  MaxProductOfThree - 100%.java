

import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    private int[] positive(int[] A){

        int[] positive = new int[A.length];
        for(int i = 0; i< A.length; i++){

            if(A[i] >= 0){
                positive[i] = A[i];
            }
        }
        return positive;
    }

    private int[] negative(int[] A){

        int[] negative = new int[A.length];
        for(int i = 0; i< A.length; i++){

            if(A[i] < 0){
                negative[i] = A[i];
            }
        }
        return negative;
    }
    
    public int solution(int[] A) {
        // write your code in Java SE 8

        int [] positive = positive(A);
        int [] negative = negative(A);

        Arrays.sort(positive);
        Arrays.sort(negative);
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        
        if( positive[positive.length-1] == 0 && negative.length >= 3) {
            return negative[negative.length-1]
                    *negative[negative.length-2]
                    *negative[negative.length-3];
        }

        if(positive.length == 0 ){
            return negative[negative.length-1]
                    *negative[negative.length-2]
                    *negative[negative.length-3];
        }
        
        if( positive.length >= 3){
            n1 = positive[positive.length-1];
            n2 = positive[positive.length-2];
            n3 = positive[positive.length-3];

            if(negative.length > 2
                 && n1*negative[0]*negative[1] > n1*n2*n3){
                return n1*negative[0]*negative[1];
            }

            return n1*n2*n3;
        }

        if( positive.length == 1){
            n1 = positive[positive.length-1];
            n2 = negative[0];
            n3 = negative[1];

            return n1*n2*n3;
        }

        n1 = positive[positive.length-1];
        n2 = positive[positive.length-2];

        if(negative.length == 1){
            n3 = negative[0];
            return n1*n2*n3; 
        }

        return n1*negative[0]*negative[1];
    }
}

