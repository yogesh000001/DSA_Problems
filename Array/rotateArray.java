package DSA_Problems.Array;

public class rotateArray {
    public static void main(String[] args) {
        int []arr = {54,34,76,54,32,34,65,38,63};
        int k = 3;
        rotateArray(arr,k);
        for (int e:arr){
            System.out.print(e+" ");
        }
    }
    public static void rotateArray(int []arr,int k){
        k = k % arr.length;
        int n = arr.length;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int []arr,int i,int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }    
}
