//https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse
import java.util.Arrays;

public class SecondLargest {
    public static int[] getSecondOrderElements(int n, int []a) {
        int slargest=secondLargest(n,a);
        int ssmallest=secondSmallest(n,a);
        return new int[]{slargest,ssmallest};
    }
    static int secondLargest(int n,int[]a)
    {
        int largest=a[0];
        int slargest=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]>largest)
            {
                slargest=largest;
                largest=a[i];
            }
            else if(a[i]!=largest && a[i]>slargest)
            {
                slargest=a[i];
            }
        }
        return slargest;
    }
    static int secondSmallest(int n, int[]a)
    {
        int smallest=a[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]<smallest)
            {
                ssmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]!=smallest && a[i]<ssmallest)
            {
                ssmallest=a[i];
            }
        }
        return ssmallest ;
    }
}