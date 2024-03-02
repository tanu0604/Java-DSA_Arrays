import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int a[]={-1,-1,2,0,1};
        int sum=0;
        int[] threeSum=sum(a);
        System.out.println((Arrays.toString(threeSum)));
    }
    static int[] sum(int[] a)
    {
        int sum=0;
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;i<a.length;i++)
            {
                for (int k=i+2;i< a.length;i++)
                {
                    sum=a[i]+a[j]+a[k];
                    if(sum==0)
                        return new int[]{a[i],a[j],a[k]};
                }
            }
        }
        return new int[]{-1,-1,-1};
    }
}
