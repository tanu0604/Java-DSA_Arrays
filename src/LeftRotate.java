//https://www.codingninjas.com/studio/problems/left-rotate-an-array-by-one_5026278?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse
import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {

            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
