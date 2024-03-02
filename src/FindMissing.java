//https://www.codingninjas.com/studio/problems/missing-number_6680467?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse
public class FindMissing {
    public static void main(String[] args) {
        int[] a={1,2,4,5};
        int n=5,sum1=0,sum2=0;
        sum1=n*(n+1)/2;

        for(int i=0;i<a.length;i++)
        {
            sum2=sum2+a[i];
        }
        System.out.println(sum1-sum2);
    }
}
