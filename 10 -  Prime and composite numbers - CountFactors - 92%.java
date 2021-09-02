

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {

        if(N == 1){
            return 1;
        }

        int countFactors = 0;
        int i = 2;

        while(i*i < N){

            if(N%i==0){
                countFactors++;
                countFactors++;
            }
            i++;
        }

        if(i*i == N){
            countFactors++;
        }

        countFactors++;  //add for 1
        countFactors++;  //add for N
        return countFactors;
    }
}

