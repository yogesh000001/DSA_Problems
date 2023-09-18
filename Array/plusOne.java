package DSA_Problems.Array;

public class plusOne {
    public static void main(String[] args) {
        int []arr = {8,9,9,9,9,9};
        int []newarr = plusOne(arr);
        for (int e:newarr){
            System.out.print(e+" ");
        }    
    }
    public static int[] plusOne(int []arr){
        int n = arr.length;
        for (int i=n-1;i>=0;i--){
            if (arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;

        return newDigits;
    }
}
