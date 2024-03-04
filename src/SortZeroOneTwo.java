import java.util.* ;
import java.io.*;
public class SortZeroOneTwo {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int low=0,mid=0,high=n-1;
        while (mid<=high)
        {
            if(arr.get(mid)==0)
            {
                //Swapping the values of low and mid
                int temp=arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid,temp);
                mid++;
                low++;
            }
            else if(arr.get(mid)==1)
            {
                mid++;
            }
            else{
                //Swapping the values of mid with the high
                int temp=arr.get(high);
                arr.set(high,arr.get(mid));
                arr.set(mid,temp);
                high--;
            }

        }
    }
    public static void main(String args[]) {
        int n = 10;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2,0,2,1,2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }
}
