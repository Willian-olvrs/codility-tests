// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {

        int n = N;
        boolean gapHasStarted = false;
        int bigestGap = 0;
        int currentGap = 0;

        while (n > 0)
        {
            if((n % 2) != 0) {

                if(currentGap > bigestGap){
                    bigestGap = currentGap;
                }

                gapHasStarted = true;
                currentGap = 0;
            }else{
                if(gapHasStarted){
                    currentGap++;
                }
            }

            n = n / 2;
        }
        return bigestGap;
    }
}
