// you can also use imports, for example:
import java.util.Stack;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] H) {

        int blockCount = 0;
        Stack<Integer> blockStack = new Stack<>();

        for(int i = 0; i < H.length; i++){

            while(!blockStack.isEmpty() && H[i] < blockStack.peek()){
                blockStack.pop();
            }

            if(blockStack.isEmpty() || H[i] > blockStack.peek()){
                blockCount++;
                blockStack.push(H[i]);
            }
        }

        return blockCount;
    }
}
