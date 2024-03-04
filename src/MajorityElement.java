import java.util.ArrayList;
import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/majority-element_6783241?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems



import java.util.*;

public class MajorityElement {
    public static int majorityElement(int []v) {
        //size of the given array:
        int count=0,element=0;
        int n=v.length;
        for (int i = 0; i <n ; i++) {
            if(count==0)
            {
                count++;
                element=v[i];
            }
            else if(element==v[i])
            {
                count++;
            }
            else {
                count--;
            }
        }
        int cnt1=0;
        for (int i = 0; i < n; i++) {
            if(element==v[i]){
                cnt1++;
            }
            if(cnt1>n/2)
                return element;
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }

}
