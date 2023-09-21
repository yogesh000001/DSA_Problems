package DSA_Problems.Stack;

import java.util.Stack;

public class stackProblems_01 {
    public static void pushAtBottom(Stack<Integer> stack,int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }
    public static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i<str.length()){
            stack.push(str.charAt(i));
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            Character ch = stack.pop();
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
    }
}
