package DSA_Problems.Array;

import java.util.Arrays;

public class maxSubArraySumKadanes {
    public static int search(int []arr,int item){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid]==item){
                return mid;
            }else if (arr[mid]>item){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int []arr = {6,34,34,100,54,65,66,87};
        int item = 54;
        search(arr,item);
        for (int e:arr){
            System.out.print(e+" ");
        }
    }
}
