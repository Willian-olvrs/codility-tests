

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public int getNucleotideImpact(char nucleotide){
        
        switch(nucleotide){
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            case 'T':
                return 4;
            default:
                return 0;
        }
    }


    public int totalOfASlice(int[] prefixSum, int x, int y){
        return prefixSum[y+1]- prefixSum[x];
    }

    public int[] solution(String S, int[] P, int[] Q) {
        
        int n = S.length();
        int[] prefixSumForA = new int[n+1];
        int[] prefixSumForC = new int[n+1];
        int[] prefixSumForG = new int[n+1];
        int[] prefixSumForT = new int[n+1];
        
        int nucleotideImpact = 0;
        prefixSumForA[0] = 0;
        prefixSumForC[0] = 0;
        prefixSumForG[0] = 0;
        prefixSumForT[0] = 0;

        for(int k=1; k < n+1; k++){
            nucleotideImpact = getNucleotideImpact(S.charAt(k-1));

            if(nucleotideImpact == 1){
                prefixSumForA[k] = prefixSumForA[k-1]+nucleotideImpact;
            }else{
                prefixSumForA[k] = prefixSumForA[k-1];
            }

            if(nucleotideImpact == 2){
                prefixSumForC[k] = prefixSumForC[k-1]+nucleotideImpact;
            }else{
                prefixSumForC[k] = prefixSumForC[k-1];
            }

            if(nucleotideImpact == 3){
                prefixSumForG[k] = prefixSumForG[k-1]+nucleotideImpact;
            }else{
                prefixSumForG[k] = prefixSumForG[k-1];
            }

            if(nucleotideImpact == 4){
                prefixSumForT[k] = prefixSumForT[k-1]+nucleotideImpact;
            }else{
                prefixSumForT[k] = prefixSumForT[k-1];
            }
        }

        int m = P.length;
        int[] resultArray = new int[m];

        for( int k = 0; k<m; k++){

            int totalSliceA = totalOfASlice(prefixSumForA, P[k], Q[k]);
            int totalSliceC = totalOfASlice(prefixSumForC, P[k], Q[k]);
            int totalSliceG = totalOfASlice(prefixSumForG, P[k], Q[k]);
            int totalSliceT = totalOfASlice(prefixSumForT, P[k], Q[k]);

            if(totalSliceT > 0){
                resultArray[k] = 4;
            }

            if(totalSliceG > 0){
                resultArray[k] = 3;
            }

            if(totalSliceC > 0){
                resultArray[k] = 2;
            }

            if(totalSliceA > 0){
                resultArray[k] = 1;
            }
            
        }

        return resultArray;
    }
}

