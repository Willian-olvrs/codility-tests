// you can also use imports, for example:

import java.util.LinkedList;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    private LinkedList<Integer> getPeaks(int[] A){

        LinkedList<Integer> peaks = new LinkedList<>();

        for(int i = 1; i< A.length-1; i++){
            if(A[i] > A[i-1] && A[i] > A[i+1]) {
                peaks.add(i);
            }
        }

        return peaks;
    }

    public int solution(int[] A) {
        
        if(A.length < 3){
            return 0;
        }

        LinkedList<Integer> peaks = getPeaks(A);

        int maxFlags = 0;
        for(int k = peaks.size(); k > 0 && maxFlags < k; k--){

            int lastFlagIndex = 0;
            int countFlag = 1;

            for(int i = 1; i < peaks.size(); i++){

                if(peaks.get(i) < peaks.get(lastFlagIndex)+k){
                    continue;
                }
                countFlag++;
                lastFlagIndex = i;
            }
            if(countFlag > maxFlags){
                maxFlags = countFlag;
            }
        }

        return maxFlags;
    }
}
