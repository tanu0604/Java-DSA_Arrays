//https://leetcode.com/problems/maximum-subarray/submissions/1193739878/
import java.util.* ;
import java.io.*;

public class LongestSubarraySum {

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long sum=0;
        long maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }if(sum>maxi){
            maxi=sum;
        }

        }
        return  maxi;
    }

    public static void main(String[] args) {
        int []arr={-2,-3,4,-1,-2,1,5,-3};
        int n= arr.length;
        System.out.println(maxSubarraySum(arr,n));
    }
}
