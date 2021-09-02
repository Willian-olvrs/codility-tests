// you can also use imports, for example:
// import java.util.*;

import java.lang.Integer;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {

        int countFactors = 0;
        int i = 2;
        int minPerimeter = Integer.MAX_VALUE;

        while(i*i <= N){
            if(N%i == 0 ){

                int areaFactor = N/i;
                int perimeter = (i+areaFactor)*2;

                if(perimeter < minPerimeter){
                    minPerimeter = perimeter;
                }

                countFactors++;
                countFactors++;
            }
            i++;
        }

        if(countFactors == 0){
            return 2*(N+1);
        }

        return minPerimeter;
    }
}
