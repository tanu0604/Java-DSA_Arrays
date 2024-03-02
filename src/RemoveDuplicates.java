import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int []arr={1,1,2,2,3,3,3,4};
        int n= arr.length;
        System.out.println(remove(arr,n));
    }
    static int remove(int [] arr,int n)
    {
        int i=0;
        int j;
        for(j=1;j<n;j++)
        {
            if(arr[j]!=arr[i])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i++;
    }
}
