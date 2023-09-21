import java.util.*;
public class nextGreaterElement {
    public static void nextGreaterElement(int []arr){
        int [] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int ii = st.pop();
                nge[ii] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int ii = st.pop();
            nge[ii] = -1;
        }
    }
    public static void main(String[] args) {
        
    }
}
