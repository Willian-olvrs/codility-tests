// you can also use imports, for example:
 import java.util.Stack;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    boolean isRightCloseBracket(char openBracket, char closeBracket){

        return (openBracket == '(' && closeBracket == ')') ||
               ( openBracket == '{' && closeBracket == '}') ||
               ( openBracket == '[' && closeBracket == ']');
    }

    boolean isOpenBracket(char bracket){
        return bracket == '(' || bracket == '{' || bracket == '[';
    }

    public int solution(String S) {
        // write your code in Java SE 8

        Stack<Character> bracketStack = new Stack<Character>();

        for(int i = 0; i< S.length(); i++){

            if(isOpenBracket(S.charAt(i))){
                bracketStack.push(S.charAt(i));
            } else{ 

                if(bracketStack.size() == 0
                   || !isRightCloseBracket(bracketStack.pop(), S.charAt(i))){
                    return 0;
                }

            }

        }

        if(bracketStack.size() != 0){
            return 0;
        }

        return 1;
    }
}
