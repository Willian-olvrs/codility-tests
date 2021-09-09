

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    private boolean isPrime(int n){

        int i = 2;

        while(i*i <= n){

            if(n%i == 0){
                return false;
            }
            i++;
        }

        return true;
    }

    private boolean hasPrimeDivisors(int n){

        for( int i = 2; i < n; i++){
            if( n % i == 0 && isPrime(i)){
                return true;
            }
        }

        return false;
    }

    private int gcd(int a, int b){

        if( a == b ){
            return a;
        }

        if( a > b){
            return gcd(a - b, b);
        }  
        
        return gcd(a, b - a);
    }

    private boolean isDifferentPrimeSets(int a, int b){

        if( a > b){
            int copy = b;
            b = a;
            a = copy;
        }

        for( int k = b; k > 1; k--){
            
            if( (a % k == 0 && b%k != 0) || (a % k != 0 && b%k == 0)) {
                if( isPrime(k)){
                    return true;
                }
            }
        }

        return false;
    }

    public int solution(int[] A, int[] B) {

        int countDifferentPrimeSets = 0;

        for(int i = 0; i < A.length; i++){

            int a = A[i];
            int b = B[i];

            if(gcd(a,b) == 1 && (a != 1 || b != 1)){
                countDifferentPrimeSets++;
            } else {
                if(isDifferentPrimeSets(a,b) && a != 1 && b != 1){
                    countDifferentPrimeSets++;
                }
            }
        }
        return A.length - countDifferentPrimeSets;
    }
}

