//https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse
public class CheckSortedARray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int ans=Check(arr);
        System.out.println(ans);
    }
    static int Check(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>=arr[mid-1] && arr[mid]<=arr[mid+1])
                return 1;
            else
                return 0;
        }
        return 0;
    }

}
