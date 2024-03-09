import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        int [] a={1,4,3,2,7,8,5};
        int ans=longest(a);
        System.out.println(ans);
    }
    static int longest(int []a){
            // Write your code here.
            int n=a.length;
            if(n==0) {
                return 0;
            }
        Arrays.sort(a);
            int count=1;
            int longest=1;
            int lastSmaller=Integer.MIN_VALUE;
            for(int i=0;i<n;i++) {
                if (a[i] - 1 == lastSmaller) {
                    count++;
                    lastSmaller = a[i];
                } else if (a[i] != lastSmaller) {
                    count = 1;
                    lastSmaller = a[i];
                }
                if(count>longest)
                {
                    longest=count;
                }
            }
            return longest;
        }
    }
