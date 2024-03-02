import java.sql.SQLOutput;
import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int a[]={1,2,0,0,8,6,0,4,0,9};
        int n,count=0,i;
        n= a.length;
        System.out.print("Array before moving all the zeroes in the end: ");
        System.out.print(Arrays.toString(a));
        //Step 1: Moved all the non zero elements to a temp array
        for( i=0;i<n;i++)
        {
            if(a[i]!=0)
                count++;
        }
        int[] temp=new int[count];
        int index=0;
        for(i=0;i<n;i++)
        {
            if(a[i]!=0) {
                temp[index] = a[i];
                index++;
            }
        }
        //Step 2: Copy the temp array to the original array
        for(i=0;i<count;i++)
        {
            a[i]=temp[i];
        }
        //Step 3: Now fill all the remaining places in the array with zero
        for(i=count;i<n;i++)
        {
            a[i]=0;
        }
        System.out.println(" ");
        System.out.print("Array after moving all the zeroes in the end: ");
        System.out.print(Arrays.toString(a));
    }
}