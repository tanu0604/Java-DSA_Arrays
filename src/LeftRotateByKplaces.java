import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByKplaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6};
        int n= arr.length,k;
        System.out.println("Enter the times you want to rotate an array: ");
        k=sc.nextInt();
        for(int i=0;i<n;i++) {
            if (k == n){
                System.out.println(Arrays.toString(arr));
                break;}
        }
    }
}
