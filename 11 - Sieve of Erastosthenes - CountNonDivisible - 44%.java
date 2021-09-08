// you can also use imports, for example:
// import java.util.*;
//import java.util.HashMap;


// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    private int[] sieve(int n){

        int[] sieve = new int[n+1];
        
        int i = 2;

        while(i*i <= n){
            if(sieve[i] == 0){
                int k = i*i;
                    while ( k <= n){
                        if( sieve[k] == 0){
                            sieve[k] = i;
                        }
                        k = k+i;
                    }
            }
            i = i+1;
        }

        return sieve;
    }

    private int[] countElements(int[] A){

        int[] count = new int[2*A.length+1];

        for(int i = 0; i < A.length; i++ ){
            count[A[i]]++;
        }

        return count;
    }

    public int[] solution(int[] A) {
        // write your code in Java SE 8
        int[] nonDivisors = new int[A.length];
        int[] sieve = sieve(2*A.length);
        int[] countElements = countElements(A);

        for(int i = 0; i < A.length; i++){

            int[] divisorCounted = new int[2*A.length+1];
            int divisors = 0;
            int j = A[i];
            
            while(sieve[j] != 0) {

                if(divisorCounted[j] == 0){
                    divisors = divisors + countElements[j];
                    divisorCounted[j] = 1;
                }

                if(divisorCounted[sieve[j]] == 0){
                    divisors = divisors + countElements[sieve[j]];
                    divisorCounted[sieve[j]] = 1;
                }

                j = j/sieve[j];
            }

            if(divisorCounted[j] == 0){
                divisors = divisors + countElements[j];
                divisorCounted[j] = 1;
            }
        
            if( j == 1){
                nonDivisors[i] = A.length - divisors;
            } else {
                nonDivisors[i] = A.length - divisors - countElements[1];
            }
        }

        return nonDivisors;
    }
}
