//https://takeuforward.org/arrays/rearrange-array-elements-by-sign/
import java.util.Arrays;

public class alternate {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -1, -2, 3};
        int[] ans = alternateNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }
         static int[]alternateNumbers(int []arr) {
            // Write your code here.
            int n = arr.length;
            int [] alt= new int [n];
            int positive=0,negative=1;
            for(int i=0;i<n;i++)
            {
                if(arr[i]>0)
                {
                    alt[positive]=arr[i];
                    positive+=2;
                }
                else{
                    alt[negative]=arr[i];
                    negative+=2;
                }
            }
            return alt;
        }
}
