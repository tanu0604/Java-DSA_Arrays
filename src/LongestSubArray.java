import java.util.Arrays;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        for (int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
